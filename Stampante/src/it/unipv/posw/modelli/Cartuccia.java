package it.unipv.posw.modelli;

public class Cartuccia extends ColoreClass{
	
	private final double UNO_PERCENTO = 2.55;
	
	public Cartuccia() {
		
	}
	
	public Cartuccia (Colore colore) {
		super.setColore(colore);
	}
	
	public int sottraiInchiostro(double inchiostroUsato) {
		
		double result = 0;
		double percentualeInchiostro;
		
		if (super.red > 0) {
			result = red - inchiostroUsato;
			red = (int)result;	
		}
		
		if (super.green > 0) {
			result = green - inchiostroUsato;
			green = (int)result;
		}
		
		if (super.blue > 0) {
			result = blue - inchiostroUsato;
			blue = (int)result;
		}
		
		percentualeInchiostro = result / UNO_PERCENTO;
		return (int)percentualeInchiostro;
	}
	

}
