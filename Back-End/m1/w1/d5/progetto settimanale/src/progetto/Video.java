package progetto;

public class Video extends Multimedia implements VideoImmagini, VideoAudio{
	
	private int durata;
	private int volume;
	private int luminosita;
	private String puntoEsc = "";
	private String ast = "";

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo);
		
		this.durata = durata;
		this.volume = volume;
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

	@Override
	public int alzaVolume() {	
		return this.volume++;
	}

	@Override
	public int abbassaVolume() {	
		return this.volume--;
	}

	@Override
	public void play() {
		for(int i = 0; i < this.durata; i++) {
			System.out.println(super.getTitolo() + this.creaEsclamativi() + this.creaAsterischi());
			}
	
	}
	
	public String creaEsclamativi() {
		this.puntoEsc = "";
		for(int i = 0; i < this.volume; i++) {
			this.puntoEsc += "!";
		}
		return this.puntoEsc;
	}
	
	public String creaAsterischi() {
		this.ast = "";
		for(int i = 0; i <  this.luminosita; i++) {
			this.ast += "*";
		}
		return this.ast;
		
	}
	

}
