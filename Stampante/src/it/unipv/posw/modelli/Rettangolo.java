package it.unipv.posw.modelli;

public class Rettangolo extends Forme {
	
	private double base;
	private double altezza;
	private String nomeForma = "Rettangolo";
	
	public Rettangolo(Colore colore) {
		super(colore);
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