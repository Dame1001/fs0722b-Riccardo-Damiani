   //for per ciclare basandosi su un indice a scelta
   for(let i = 0; i < 10; i++){
    document.write(i)

   }

   document.write('<hr>');
  
   //for per ciclare array
   let animali = ['Tigre','Leone','Gatto','Cane','Alpaca'];
   for(let i = 0; i < animali.length; i++){
    document.write(animali[i]);
   }

   document.write('<hr>');

   //for per ciclare array
   for(let animale of animali){
    document.write(animale + ' - ');
   }

   document.write('<hr>');

   //for per ciclare stringhe
   let stringa = 'Ciao, come va?';
   for(let lettera of stringa){
    document.write(lettera + '<br>');
   }

   //for per ciclare oggetti
   let utente = {
       nome:'Mario',
       cognome:'Rossi',
       anni: 30
   }

   let propAccettate = ['nome', 'cognome', 'anni']
   
   document.write('<ul>')
   for(let proprietà in utente){ 
    document.write(`<li>${proprietà}: ${utente[proprietà]} </li>`)
   }
