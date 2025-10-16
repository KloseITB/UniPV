package it.unipv.posw.modelli;

public abstract class Forme extends ColoreClass{
	
	
	public Forme(Colore colore) {
		super.setColore(colore);
	}
	
	public abstract double calcolaArea();
	public abstract String getNomeForma();
	
}
