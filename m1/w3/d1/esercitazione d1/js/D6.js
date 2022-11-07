/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato..
*/

/*const area = function (l1, l2){
    return l1 * l2;

}

const areaResult = area(3,4);
console.log(areaResult);*/

function areaRettangolo(l1,l2){
    return l1 * l2;
    
}
let area = areaRettangolo(4,6);
console.log(area);


/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

/*function crazySum(n1, n2){
if(n1==n2){
    return(n1+n2)*3;
}
else return n1+n2;
}*/

const crazySum = function (n1,n2){
    if(n1===n2){
        return(n1+n2)*3;
    }
    else{
        return n1+n2;
    }
   
}
console.log(crazySum(3,3))



/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/*const crazyDiff = function (num){
    if(num > 19){
        return Math.abs(num-19)*3
    }
    else{
        return Math.abs(num-19)
    }
}
console.log(crazyDiff(22))*/

/*function crazyDiff (a = 30, b = 19){
    return a-b
}

if (30 > 19) {
    console.log(crazyDiff(30,19)*3)
}
else{
    console.log(crazyDiff(30,19))
}*/

function crazyDiff (n) {
    if (n>19) {return 3*(n-19);
    }
    else {
        return n>19
    }
    
}
console.log(crazyDiff(21))

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/*function boundary(n) {
    if ((n >= 20 && n <= 100 ) || n === 400) {
        return console.log(true)
    }
    else {
        return console.log(false)
    }
}

boundary(150);*/

/*const boundary = function (n) {
    if ((n >= 20 && n <= 100) || n === 400){
    return true;
    }
    else {
        return false
    }
} 
console.log('ex4', boundary(3))*/

function boundary(n) {
    switch (true){
        case n == 400: return true; break
        case n >= 20 && n <= 100: return true; break
        default: return false ; 
        
    }
}

console.log(boundary(400))







/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/*const epify = function(str){
    if(str.startsWith('EPICODE')){
        return str
    }else return 'EPICODE' + str
}
console.log(epify('EPICODERS'))
console.log(epify('Hello'))*/

let epi = 'EPICODE'
//function per comparare il carattere i/esimo di due stringhe
function epify (str) {
    let textStr = str.substring(0,7)
    if(textStr != epi){return str = epi + str}//prende la sottostringa dei primi 6 caratteri
    else return str;
}
console.log(epify('EPICODERS'))
console.log(epify('Hello'))


/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

/*function check3and7(n){
    
    if( n % 3 ==0 || n % 7 ==0 && n > 0){
        console.log('è multiplo')
    }
    else{
        console.log('non è multiplo');
    }
    
}
check3and7(21);*/

const check3and7 = function (n) {
    if(n >= 0 && (n % 3=== 0 || n % 7 === 0 )){
        return true;
    }
    else{
        return false;
    }
}

console.log(check3and7(20));



/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

/*function reverseString (str){
    let strReversed=[];//serve a contenere i caratteri di str in ordine inverso
    let rev ='';//conterrà la stringa invertita
    for(let i = 0; i < str.length; i++){
        strReversed[i] = str [str.length - 1 - i];
        rev += strReversed [i];
    }return rev
}
console.log(reverseString('epicode'))*/

/*const reverseString = function(str){
    let splitString = str.split('')
    let reverseString = splitString.reverse()
    let finalString = reverseString.join('')
    return finalString
}
console.log(reverseString('epicode'))*/

const reverseString = function(string){
    return string.split ('').reverse().join('')
}
console.log(reverseString('epicode'))


/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
