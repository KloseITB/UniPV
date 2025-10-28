package it.unipv.posw.modelli;

public class Rettangolo extends Forme {
	
	private double base;
	private double altezza;
	private String nomeForma = "Rettangolo";
	
	public Rettangolo(Colore colore, double base, double altezza) {
		super(colore);
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		double area = base * altezza;
		return area;
	}

	public void setLato(double base, double altezza) {
		this.base = base;
	}
	
	@Override
	public String getNomeForma() {
		return nomeForma;
	}

}