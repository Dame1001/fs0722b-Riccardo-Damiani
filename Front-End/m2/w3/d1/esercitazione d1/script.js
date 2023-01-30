function Persona() {
    this.nome = '';
    this.eta = '';
    this.current_data = new Date();
    this.calcolaEta = function() {
        this.soluzione = valueOf (this.year2)
    }
}



var nome = document.querySelector('#nome');
var cognome = document.querySelector('#cognome');
var data = document.querySelector('#data');
var bottone = document.querySelector('#button');
var persona = new Persona();
var tabella = document.querySelector('#tabella');
bottone.addEventListener('click',() => {
    console.log(nome.value);
    console.log(cognome.value);
    console.log(data.value);





    if(nome.value && cognome.value && data.value) {
        persona.nome = nome.value + ' ' + cognome.value;
        tabella.innerHTML += '<tr> <td>' + persona.nome + '</td> <td>' + +'</td> <td>';
        nome.value = '';
        cognome.value = '';
        data.value = '';
    }
    console.log(persona.nome);
    console.log(persona.eta);

});
