var giocatore1 = Math.floor(Math.random() * (100 - 1) + 1);
var giocatore2 = Math.floor(Math.random() * (100 - 1) + 1);
function confronto(a, b) {
    console.log('il giocatore 1 ha detto ' + a);
    console.log('il giocatore 2 ha detto ' + b);
    var numeroCasuale = Math.floor(Math.random() * (100 - 1) + 1);
    console.log(numeroCasuale);
    if (a == numeroCasuale) {
        console.log('giocatore 1 ha vinto');
    }
    else if (b == numeroCasuale) {
        console.log('giocatore 2 ha vinto');
    }
    else {
        if (Math.abs(numeroCasuale - a) > Math.abs(numeroCasuale - b)) {
            console.log('Nessuno dei due ha indovinato, ma il giocatore 2 è più vicino');
        }
        else {
            console.log('Nessuno dei due ha indovinato, ma il giocatore 1 è più vicino');
        }
    }
}
confronto(giocatore1, giocatore2);
