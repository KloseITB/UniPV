package it.unipv.posw.modelli;

public class Stampante extends Cartuccia {
	
	private Cartuccia cartucciaRossa;
	private Cartuccia cartucciaBlu;
	private Cartuccia cartucciaVerde;
	
	public Stampante() {
		super();
		cartucciaRossa = new Cartuccia(Colore.RED);
		cartucciaBlu = new Cartuccia(Colore.BLUE);
		cartucciaVerde = new Cartuccia(Colore.GREEN);
	}
	
	
	public void calcolaInchiostroRimasto() {
		
	}
	
	public void Stampa(ImmagineVettoriale immagineVettoriale) {
		
		Forme[] formeUsate = immagineVettoriale.getForme();
		for (int n = 0; formeUsate.length > n; n++) {
			System.out.print("Ho stampato un " + formeUsate[n].getNomeForma() + "\n");
		}
		
		immagineVettoriale.calcolaInchiostroUsato();
		double[] ValoriRGB = immagineVettoriale.getValoriRGB();
		System.out.print("Inchiostro usato: \n");
		for(int n = 0; ValoriRGB.length > n; n++){
			System.out.print(ValoriRGB[n] + "\n");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Cerchio faccia = new Cerchio(Colore.RED);
		Quadrato orecchioSx = new Quadrato(Colore.GREEN); 
		Quadrato orecchioDx = new Quadrato(Colore.GREEN);
		
		Forme[] formeUtilizzate = {faccia, orecchioSx, orecchioDx};
		
		ImmagineVettoriale logoGatito = new ImmagineVettoriale(formeUtilizzate);
		Stampante stampante = new Stampante();
		
		stampante.Stampa(logoGatito);
	}
}
