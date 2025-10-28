package it.unipv.posfw.StampanteAvanzata.forme;

import java.util.HashMap;

public class Cerchio extends Forme{
	
	private double raggio;
	
	public Cerchio(HashMap<String, Double> colorMap) {
		super(colorMap);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		double result = 2f * Math.PI * raggio * raggio;
		return result;
	}
	
	
}
