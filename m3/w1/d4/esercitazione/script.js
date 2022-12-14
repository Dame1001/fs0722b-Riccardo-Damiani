fetch("assets/Abbigliamento.json")
    .then(function (response) {
    return response.json();
})
    .then(function (myJson) {
    var principale = document.querySelector('#principale');
    var coloreSfondo;
    for (var i = 0; i < myJson.length; i++) {
        var vestito = new CapoAbbigliamento(myJson[i].id, myJson[i].codprod, myJson[i].collezione, myJson[i].capo, myJson[i].modello, myJson[i].quantita, myJson[i].colore, myJson[i].prezzoivaesclusa, myJson[i].prezzoivainclusa, myJson[i].disponibile, myJson[i].saldo);
        if (vestito.colore == 'nero') {
            coloreSfondo = '#0000008f';
        }
        else if (vestito.colore == 'rosso') {
            coloreSfondo = '#FF0800a6';
        }
        else if (vestito.colore == 'beige') {
            coloreSfondo = '#caaa81a3';
        }
        else if (vestito.colore == 'verde') {
            coloreSfondo = '#00563bbd';
        }
        else if (vestito.colore == 'blu') {
            coloreSfondo = '#002d62b3';
        }
        else if (vestito.colore == 'viola') {
            coloreSfondo = '#720e9eab';
        }
        else if (vestito.colore == 'grigio') {
            coloreSfondo = '#909090bd';
        }
        else if (vestito.colore == 'azzurro') {
            coloreSfondo = '#318ce7b8';
        }
        principale.innerHTML += "\n       <div class=\"col-3 my-3\">\n       <div class=\"card\" style=\"background-color:".concat(coloreSfondo, ";border: 2px solid white\">\n       <div class=\"card-body text-center text-white\">\n         <h5 class=\"card-title mb-2\">").concat((vestito.capo).toUpperCase(), "</h5>\n         <p class=\"card-text lh-2\">Collezione: ").concat(vestito.collezione, "</p>\n         <p class=\"card-text lh-2\">Colore: ").concat(vestito.colore, "</p>\n         <p class=\"card-text lh-2\">Prezzo base: ").concat(vestito.prezzoIvaInclusa, "\u20AC</p>\n         <p class=\"card-text lh-2\">Prezzo speciale: ").concat(vestito.getAcquistoCapo(), "\u20AC</p>\n         <p class=\"card-text lh-2\">Sconto: ").concat(vestito.saldo, "%</p>\n         <button class=\"border rounded bg-white\">Compra</button>\n       </div>\n       </div> \n       </div> \n       ");
    }
});
var CapoAbbigliamento = /** @class */ (function () {
    function CapoAbbigliamento(id, codprod, collezione, capo, modello, quantita, colore, prezzoIvaEsclusa, prezzoIvaInclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoIvaEsclusa = prezzoIvaEsclusa;
        this.prezzoIvaInclusa = prezzoIvaInclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    CapoAbbigliamento.prototype.getSaldoCapo = function () {
        return this.prezzoIvaInclusa * this.saldo / 100;
    };
    CapoAbbigliamento.prototype.getAcquistoCapo = function () {
        return JSON.parse(parseFloat(JSON.stringify(this.prezzoIvaInclusa - this.getSaldoCapo())).toPrecision(3));
    };
    return CapoAbbigliamento;
}());
