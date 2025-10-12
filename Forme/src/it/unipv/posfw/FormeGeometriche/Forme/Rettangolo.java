package it.unipv.posfw.FormeGeometriche.Forme;


public class Rettangolo {

	// ---------- Attributes Declaration ----------
	
		private double base, altezza;
		
	// ---------- Constructors ----------
		
		public Rettangolo(double primoDato, double secondoDato) {
			base = primoDato;
			altezza = secondoDato;
		}
		
	// ---------- Class Methods ----------
		
		public void setBase(int newBase) {
			base = newBase;
		}
		
		public void setAltezza(int newAltezza) {
			altezza = newAltezza;
		}
		
		public double getDiagonale() {
			
			double diametro = Math.sqrt(altezza * altezza + base * base);
			return diametro;
		}
		
		public void invertiBaseEAltezza() {
			double buffer;
			buffer = altezza;
			altezza = base;
			base = buffer;
			
		}

		
	// ---------- Main Method ----------
		
		public static void main(String[] args) {
			
			Rettangolo rettangolo = new Rettangolo (4, 3);
			System.out.println("la diagonale è: " + rettangolo.getDiagonale() + "\n");
			rettangolo.invertiBaseEAltezza();
			System.out.print("base e altezza sono stati invertiti. base = " + rettangolo.base + " altezza = " + rettangolo.altezza + "\n");
			
			Rettangolo rettangoloInvertito = new Rettangolo(rettangolo.altezza, rettangolo.base);
			System.out.println("il rettangolo invertito ha: base = " + rettangolo.base + " altezza = " + rettangolo.altezza);
		}


}
