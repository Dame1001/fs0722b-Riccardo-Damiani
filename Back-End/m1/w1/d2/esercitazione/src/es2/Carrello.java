package es2;

public class Carrello {
	Cliente clienteAssociato;
	Articolo elencoArticoli[];
	double totaleCostoArticoli;
	
	public Carrello(Cliente cus, Articolo el[]) {
		this.clienteAssociato = cus;
		this.elencoArticoli = el;
		for(int i = 0; i < el.length ; i++) {
			this.totaleCostoArticoli += el[i].prezzo;
			
		}
		
	}

}
