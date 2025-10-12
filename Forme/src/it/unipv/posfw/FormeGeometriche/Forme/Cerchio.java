package it.unipv.posfw.FormeGeometriche.Forme;

public class Cerchio {
	// ------ Variables Declaration ------
	
		private double raggio;
		
		// ------ Constructor ------
		
		public Cerchio(double primoDato) {
			raggio = primoDato;
		}
		
		// ------ Methods ------
		
		public double getRaggio() {
			return raggio;
		}
		
		public Quadrato creaQuadratoInscritto() {
			double lato = (2 * raggio) / Math.sqrt(2);
			Quadrato quadrato = new Quadrato(lato);
			return quadrato;
		}
		
		
		// ------ Main Method ------	

	public static void main(String[] args) {
		Cerchio cerchio = new Cerchio(3);
		
		Quadrato rettangoloInscritto = cerchio.creaQuadratoInscritto();
		System.out.print("Il rettangolo inscritto ha lato: " + rettangoloInscritto.getLato() + "\n");
	}

}
