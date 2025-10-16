package it.unipv.posw.modelli;

public class ColoreClass {
	public final int MAX_VALUE = 255;
	protected int red, green, blue = 0;
	protected Colore coloreScelto;
	
	public void setColore(Colore coloreScelto) {
		
		this.coloreScelto = coloreScelto;
		
		switch (coloreScelto) {
		case RED: 
			red = MAX_VALUE;
			break;
		case GREEN:
			green = MAX_VALUE;
			break;
		case BLUE:
			blue = MAX_VALUE;
			break;
		default:
			System.out.println("Error: Exiting program...");
			break;
		}

	}
}
