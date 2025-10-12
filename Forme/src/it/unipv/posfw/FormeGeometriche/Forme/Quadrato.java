package it.unipv.posfw.FormeGeometriche.Forme;

public class Quadrato {
	
	// ------ Variables Declaration ------
	
	private double lato;
	
	// ------ Constructor ------
	
	public Quadrato(double primoDato) {
		lato = primoDato;
	}
	
	// ------ Methods ------
	
	public double getLato() {
		return lato;
	}
	
	public double getDiagonale() {
		
		return lato * Math.sqrt(2);
	}
	
	public Cerchio creaCerchioInscritto(){
		
		Cerchio cerchio = new Cerchio(lato);
		return cerchio;
	}
	
	
	// ------ Main Method ------
	
	public static void main(String[] args) {
		Quadrato quadrato = new Quadrato(9);
		
		Cerchio cerchioInscritto = quadrato.creaCerchioInscritto();
		System.out.print("Il primo cerchio inscritto ha raggio: " + cerchioInscritto.getRaggio() + "\n");
		Cerchio cerchioInscrittoDue = new Cerchio(quadrato.getDiagonale());
		System.out.print("Il secondo cerchio inscritto ha raggio: " + cerchioInscrittoDue.getRaggio()  + "\n");
	}

}
