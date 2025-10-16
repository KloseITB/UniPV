package it.unipv.posw.modelli;

public class ImmagineVettoriale {
	
	private Forme[] formeImmagineVettoriale;
	private double redUsato, greenUsato, blueUsato = 0;
	
	public ImmagineVettoriale(Forme[] ImmVettor) {
		formeImmagineVettoriale = ImmVettor;
	}
	
	public void calcolaInchiostroUsato() {

		for (int n = 0; formeImmagineVettoriale.length > n; n++) {
			
			double risultato = 0;
			risultato = formeImmagineVettoriale[n].calcolaArea();
			
			switch (formeImmagineVettoriale[n].coloreScelto) {
			case RED: 
				redUsato += risultato;
				break;
			case GREEN:
				greenUsato += risultato;
				break;
			case BLUE:
				blueUsato += risultato;
				break;
			default:
				break;
			}
			
		}
		
	}
	
	public Forme[] getForme() {
		return formeImmagineVettoriale;
	}
	
	public double[] getValoriRGB() {
		double[] valoriRGB = {redUsato, greenUsato, blueUsato};
		return valoriRGB;
	}
}
