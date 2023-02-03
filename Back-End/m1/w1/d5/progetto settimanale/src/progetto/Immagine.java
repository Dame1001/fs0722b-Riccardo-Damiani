package progetto;

public class Immagine extends Multimedia implements VideoImmagini {
	
	private int luminosita;
	private String ast = "";

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		
		this.luminosita = luminosita;
		
	}

	@Override
	public int aumentaLuminosita() {
		
		return this.luminosita++;
	}

	@Override
	public int diminuisciLuminosita() {
		
		return this.luminosita--;
	}
	
	public void show() {
		System.out.println(this.getTitolo() + this.creaAsterischi() );
	}
	
	public String creaAsterischi() {
		this.ast = "";
		for(int i = 0; i <  this.luminosita; i++) {
			this.ast += "*";
		}
		return this.ast;
		
	}

}
