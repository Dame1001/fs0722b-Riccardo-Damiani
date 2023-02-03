package esercitazione;

public class esercizio4 {

	public static void stampaContoRovescia(int a) {
		for (int i = a; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		stampaContoRovescia(7);
	}
}
