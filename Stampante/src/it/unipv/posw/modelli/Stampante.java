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
	
	public void stampa(ImmagineVettoriale immagineVettoriale) {
		
		Forme[] formeUsate = immagineVettoriale.getForme();
//		for (int n = 0; formeUsate.length > n; n++) {
//			System.out.print("Ho stampato un " + formeUsate[n].getNomeForma() + "\n");
//		}
		
		immagineVettoriale.calcolaInchiostroUsato();
		int[] ValoriRGB = immagineVettoriale.getValoriRGB();
		
		System.out.print("Immagine stampata \n" + "Inchiostro rimasto: \n" +
				(int)cartucciaRossa.sottraiInchiostro(ValoriRGB[0])+ "%\n" +
				(int)cartucciaVerde.sottraiInchiostro(ValoriRGB[1])+ "%\n" +
				(int)cartucciaBlu.sottraiInchiostro(ValoriRGB[2]) + "%\n"
		);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Cerchio faccia = new Cerchio(Colore.RED, 4);
		Quadrato orecchioSx = new Quadrato(Colore.GREEN, 2); 
		Quadrato orecchioDx = new Quadrato(Colore.GREEN, 2);
		
		Forme[] formeUtilizzate = {faccia, orecchioSx, orecchioDx};
		
		ImmagineVettoriale logoGatito = new ImmagineVettoriale(formeUtilizzate);
		Stampante stampante = new Stampante();
		
		stampante.stampa(logoGatito);
	}
}
