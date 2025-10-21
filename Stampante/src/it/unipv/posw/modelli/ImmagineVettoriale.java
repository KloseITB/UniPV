package it.unipv.posw.modelli;

public class ImmagineVettoriale {
	
	private Forme[] formeImmagineVettoriale;
	private double redUsato, greenUsato, blueUsato = 0;
	
	public ImmagineVettoriale(Forme[] ImmVettor) {
		formeImmagineVettoriale = ImmVettor;
	}
	
	public void calcolaInchiostroUsato() {

		for (int n = 0; formeImmagineVettoriale.length > n; n++) {
			
			switch (formeImmagineVettoriale[n].coloreScelto) {
			case RED: 
				redUsato += formeImmagineVettoriale[n].calcolaArea();
				break;
			case GREEN:
				greenUsato += formeImmagineVettoriale[n].calcolaArea();
				break;
			case BLUE:
				blueUsato += formeImmagineVettoriale[n].calcolaArea();
				break;
			default:
				break;
			}
			
		}
		
	}
	
	public Forme[] getForme() {
		return formeImmagineVettoriale;
	}
	
	public int[] getValoriRGB() {
		int[] valoriRGB = {(int)redUsato, (int)greenUsato, (int)blueUsato};
		return valoriRGB;
	}
}
