package progetto;

public class Audio extends Multimedia implements VideoAudio {
	
	private int durata;
	private int volume;
	private String puntoEsc = "";
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
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
			System.out.println(super.getTitolo() + this.creaEsclamativi());
		}
	}
	
	public String creaEsclamativi() {
		this.puntoEsc = "";
		for(int i = 0; i < this.volume; i++) {
			this.puntoEsc += "!";
		}
		return this.puntoEsc;
	}

}
