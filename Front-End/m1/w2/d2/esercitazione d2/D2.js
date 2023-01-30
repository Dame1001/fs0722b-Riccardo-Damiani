/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

var stringa = 'parola'; // è una stringa se è contenuta dentro degli apici
console.log(stringa);

var numero = 10; //variabile numerica ha dato di tipo numerico e non è contenta in apici
console.log (numero);

var booleana = true; //variabile booleana ha solo due valori: true o false
console.log(booleana);

var array = ['parola' , 10 , true ] //lista di valori di qualsiasi dato visto sopra

var persona = { //coppie di valori
  nome: 'Riccardo',
  età: 25
}
console.log(persona.nome);
console.log(persona.età);

/* ESERCIZIO 2
 Crea una variable chiamata "name" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

let name = 'Riccardo'


/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

let n1 = 12;
let n2 = 20;
let somma = ( n1 + n2);
console.log(somma)

/*assegnando ad ognuno dei due numeri una variabile e creando una variabile "somma" con all'interno l'operazione per sommare le due variabili utilizzando document.write è possibile ottenere il totale della somma dei due numeri*/



/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

var x = 12


/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "name" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

name = 'Damiani';
console.log(name);

const esercizio5 = 'prova';
esercizio5 = 'prova1';
console.log(esercizio5)




/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

var y = 4;
var sottrazione = (x - y);
console.log (sottrazione)

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

var name1 = 'john';
var name2 = 'John';
console.log (name1 === name2);






