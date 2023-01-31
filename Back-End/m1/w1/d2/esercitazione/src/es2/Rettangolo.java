package es2;

public class Rettangolo {
	double altezza;
	double base;
	
	public Rettangolo(double a, double b) {
		this.altezza = a;
		this.base = b;
	}
	
	public double calcolaPerimetro() {
		return (this.altezza + this.base)*2;
	}

	public double calcolaArea() {
		return (this.altezza * this.base);
	}
}
