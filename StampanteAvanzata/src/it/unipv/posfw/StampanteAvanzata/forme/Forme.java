package it.unipv.posfw.StampanteAvanzata.forme;

import java.util.HashMap;

public abstract class Forme extends Color{

	public Forme(HashMap<String, Double> colorMap) {
		super(colorMap);
	}

	public abstract double getArea();
	
}
