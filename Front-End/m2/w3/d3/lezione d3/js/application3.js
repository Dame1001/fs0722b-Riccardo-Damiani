function clickCounter() {
    if (typeof(Storage) != undefined) {
        if (sessionStorage.clickcount) {
            sessionStorage.clickcount = Number(sessionStorage.clickcount) +1;
        } else {
            sessionStorage.clickcount = 1;
        }
        document.getElementById("result").innerHTML = "Hai cliccato il bottone " + sessionStorage.clickcount + " volte questa sessione"; 
    } else {
        document.getElementById("result").innerHTML = "Il tuo browser non supporta Web storage...";
    }

}