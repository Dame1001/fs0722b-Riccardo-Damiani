window.addEventListener("load", check);

function save() {
    usr = document.querySelector("#usr").value;
    localStorage.setItem('usr', usr);
    check();
}
function deleteData() {
    localStorage.removeItem("usr");
    check();
}
function check() {
    if(localStorage.getItem('usr')) {
        txt = "Ciao, " + localStorage.getItem("usr");
    }else {
        txt = "No Data";
    }
    document.querySelector(".title").innerHTML = txt;
}

console.log("ciao")