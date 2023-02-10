package catalogo_bibliotecario;

public class Rivista extends Elemento {

	private Periodicita periodicita;

	public Rivista(Periodicita periodicita,  int codiceISBN, String titolo, int anno, int pagine) {
		super(codiceISBN, titolo, anno, pagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return this.periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

}
