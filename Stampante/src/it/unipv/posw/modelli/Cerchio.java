package it.unipv.posw.modelli;

public class Cerchio extends Forme {
	
	private double raggio;
	private String nomeForma = "Cerchio";
	
	public Cerchio(Colore colore) {
		super(colore);
	}

	@Override
	public double calcolaArea() {
		double area = 2 * Math.PI * raggio;
		return area;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public String getNomeForma() {
		return nomeForma;
	}

}
