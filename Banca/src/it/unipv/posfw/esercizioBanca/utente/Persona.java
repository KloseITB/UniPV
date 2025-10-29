package it.unipv.posfw.EsercizioBanca.utente;

public class Persona {
	private String nome;
	private String cognome;
	private String indirizzo;
	private String codiceFiscale;
	
	public Persona(String nome, String cognome, String indirizzo, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	
}
