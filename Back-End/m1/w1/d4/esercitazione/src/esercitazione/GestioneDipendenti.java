package esercitazione;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente marco = new Dipendente(5342, Dipartimento.PRODUZIONE);
		Dipendente lorenzo = new Dipendente(6785, Dipartimento.PRODUZIONE);
		Dipendente luca = new Dipendente(1654, 1300, 40, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente franco = new Dipendente(9745, 2000, 40, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		lorenzo.promuovi();
		luca.promuovi();
		
		marco.stampaDatiDipendente();
		System.out.println(" ");
		lorenzo.stampaDatiDipendente();
		System.out.println(" ");
		luca.stampaDatiDipendente();
		System.out.println(" ");
		franco.stampaDatiDipendente();
		System.out.println(" ");
		
		System.out.println("Paga Marco: " + calcolaPaga(marco, 5));
		System.out.println("Paga Lorenzo: " + calcolaPaga(lorenzo, 5));
		System.out.println("Paga Luca: " + calcolaPaga(luca, 5));
		System.out.println("Paga Franco: " + calcolaPaga(franco, 5));
		

	}
	
	public static double calcolaPaga(Dipendente d) {
		return d.getStipendio();		
	}
	
	public static double calcolaPaga(Dipendente d, int o ) {
		return d.getStipendio() + d.getImportoOrarioStraordinario() * o;
	}
	

}
