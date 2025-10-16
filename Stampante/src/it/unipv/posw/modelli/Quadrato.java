package it.unipv.posw.modelli;

public class Quadrato extends Forme {
	
	private double lato;
	private String nomeForma = "Quadrato";
	
	public Quadrato(Colore colore) {
		super(colore);
	}

	@Override
	public double calcolaArea() {
		double area = lato * lato;
		return area;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}
	
	@Override
	public String getNomeForma() {
		return nomeForma;
	}
}
