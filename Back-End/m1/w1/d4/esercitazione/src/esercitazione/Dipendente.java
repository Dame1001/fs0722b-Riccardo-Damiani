package esercitazione;

public class Dipendente {
	
	// Attributi
	static double stipendioBase = 1000;

	int matricola;
	double stipendio;
	double importoOrarioStraordinario;
	Livello liv;
	Dipartimento dip;

	// Costruttori
	public Dipendente(int matricola, Dipartimento dip) {
		this.matricola = matricola;
		this.dip = dip;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.liv = Livello.OPERAIO;
	}

	public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello liv,
			Dipartimento dip) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.liv = liv;
		this.dip = dip;
	}
	
	//Metodi
	public void stampaDatiDipendente() {
		System.out.println("Dati dipendente:");
        System.out.println("matricola: " + this.matricola);
        System.out.println("stipendio: " + this.stipendio + "€");
        System.out.println("straordinari: " + this.importoOrarioStraordinario + "€");
        System.out.println("livello: " + this.liv);
        System.out.println("dipartimento: " + this.dip);

	}
	
	public  Livello promuovi() {
		if(this.liv == Livello.OPERAIO) {
			this.liv = Livello.IMPIEGATO;
			this.stipendio = stipendioBase * 1.2;
			return Livello.IMPIEGATO;
		}else if(this.liv == Livello.IMPIEGATO) {
			this.liv = Livello.QUADRO;
			this.stipendio = stipendioBase * 1.5;
			return Livello.QUADRO;	
		}else if(this.liv == Livello.QUADRO) {
			this.liv = Livello.DIRIGENTE;
			this.stipendio = stipendioBase * 2;
			return Livello.DIRIGENTE;	
		}else {
			System.out.println("errore");
			return Livello.DIRIGENTE;
		}
		
	}
	
    // Get & Set
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDip() {
		return dip;
	}

	public void setDip(Dipartimento dip) {
		this.dip = dip;
	}

	public static double getStipendioBase() {
		return stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public Livello getLiv() {
		return liv;
	}

}
