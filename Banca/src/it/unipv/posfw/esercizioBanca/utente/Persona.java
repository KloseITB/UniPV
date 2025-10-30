package it.unipv.posfw.EsercizioBanca.utente;

import it.unipv.posfw.EsercizioBanca.conto.*;

public class Persona {
	
	// Parametri
	private String nome;
	private String cognome;
	private String indirizzo;
	private String codiceFiscale;
	
	// Costruttori
	public Persona(String nome, String cognome, String indirizzo, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.codiceFiscale = codiceFiscale;
	}
	
	// Metodi
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
}
