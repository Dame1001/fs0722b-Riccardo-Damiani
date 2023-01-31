package es2;

import java.util.Arrays;

public class Sim {
	long numeroTelefono;
	double credito = 0;
	Chiamata ultimeChiamate[] = new Chiamata[5];
	
	public Sim(long a) {
		this.numeroTelefono = a;
	}
	
	public void stampaSim() {
		System.out.println(this.numeroTelefono + " " + this.credito + " " + Arrays.toString(this.ultimeChiamate));
		
	}
}

