function numero(dato){ 
    document.getElementById("display").value += dato;
 }
 
 
 function cancella() { 
     document.getElementById("display").value = ""; 
    }
    
    
function totale() { 
    document.getElementById("display").value = eval(document.getElementById("display").value); 
    }