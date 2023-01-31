package es2;

public class Main {

	public static void main(String[] args) {
		
		//rettangoli
		Rettangolo ret = new Rettangolo(3,5);
		stampaRettangolo(ret);
		Rettangolo ret2 = new Rettangolo(10,20);
		stampaDueRettangoli(ret, ret2);
		
		//sim
		Sim s = new Sim(3279232035L);
		s.stampaSim();
		
		//ecommerce
		Cliente cliente = new Cliente(1, "Mario Rossi", "cliente@cliente.it", "1/1/1900");
		Articolo art = new Articolo (6666, "brutto", 13, 2);
		Articolo art2 = new Articolo (9999, "bello", 26, 4);
		Articolo arr[] = {art, art2}; 
		Carrello cart = new Carrello (cliente, arr);
		System.out.println(cart.totaleCostoArticoli);
		
	}
	
	public static void stampaRettangolo(Rettangolo a) {
		System.out.println(a.calcolaPerimetro());
		System.out.println(a.calcolaArea());
		
	}
	
	public static void stampaDueRettangoli(Rettangolo a, Rettangolo b) {
		System.out.println(a.calcolaPerimetro());
		System.out.println(a.calcolaArea());
		System.out.println(b.calcolaPerimetro());
		System.out.println(b.calcolaArea());
		System.out.println(a.calcolaPerimetro()+ b.calcolaPerimetro());
		System.out.println(a.calcolaArea()+ b.calcolaArea());
		
	}

}
