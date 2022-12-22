fetch("assets/Abbigliamento.json")
    .then(function(response) {
    return response.json();
    })
    .then(function(myJson) {
        let principale= document.querySelector('#principale');
        let coloreSfondo;
    for(let i=0;i<myJson.length;i++)
    {
       let vestito= new Vestito(myJson[i].id,myJson[i].codprod,myJson[i].collezione,myJson[i].capo,myJson[i].modello,myJson[i].quantita,myJson[i].colore,myJson[i].prezzoivaesclusa,myJson[i].prezzoivainclusa,myJson[i].disponibile,myJson[i].saldo)
       if(vestito.colore=='nero')
       {
        coloreSfondo='#0000008f';
       }
       else if(vestito.colore=='rosso'){
        coloreSfondo='#FF0800a6'
       }
       else if(vestito.colore=='beige'){
        coloreSfondo='#caaa81a3'
       }
       else if(vestito.colore=='verde'){
        coloreSfondo='#00ff4096'
       }
       else if(vestito.colore=='blu'){
        coloreSfondo='#002d62b3'
       }
       else if(vestito.colore=='viola'){
        coloreSfondo='#720e9eab'
       }
       else if(vestito.colore=='grigio') {
        coloreSfondo='#909090bd'
       }
       else if(vestito.colore=='azzurro') {
        coloreSfondo='#318ce7b8'
       }

       principale.innerHTML+=`
       <div class="col-3 my-3">
       <div class="card" style="background-color:${coloreSfondo};border: 2px solid white">
       <div class="card-body text-center text-white">
         <h5 class="card-title mb-2">${(vestito.capo).toUpperCase()}</h5>
         <p class="card-text lh-2">Collezione: ${vestito.collezione}</p>
         <p class="card-text lh-2">Colore: ${vestito.colore}</p>
         <p class="card-text lh-2">Prezzo iniziale: ${vestito.prezzoIvaInclusa}€</p>
         <p class="card-text lh-2">prezzo scontato: ${vestito.getAcquistoCapo()}€</p>
         <p class="card-text lh-2">sconto: ${vestito.saldo}%</p>
         <button class="border rounded bg-white">Compra</button>
       </div>
       </div> 
       </div> 
       `
    }
    })

    class Vestito{
        id:number;
        codprod:number;
        collezione:string;
        capo:string;
        modello:number;
        quantita:number;
        colore:string;
        prezzoIvaEsclusa:number;
        prezzoIvaInclusa:number;
        disponibile:string;
        saldo:number;
        constructor(id:number,codprod:number,collezione:string,capo:string,modello:number,quantita:number,colore:string,prezzoIvaEsclusa:number,prezzoIvaInclusa:number,disponibile:string,saldo:number){
            this.id=id;
            this.codprod=codprod;
            this.collezione=collezione;
            this.capo=capo;
            this.modello=modello;
            this.quantita=quantita;
            this.colore=colore;
            this.prezzoIvaEsclusa=prezzoIvaEsclusa;
            this.prezzoIvaInclusa=prezzoIvaInclusa;
            this.disponibile=disponibile;
            this.saldo=saldo;
        }
        getSaldoCapo(){
            return this.prezzoIvaInclusa*this.saldo/100;
        }
        getAcquistoCapo(){
            return JSON.parse(parseFloat(JSON.stringify(this.prezzoIvaInclusa-this.getSaldoCapo())).toPrecision(3));
        }
    }
    