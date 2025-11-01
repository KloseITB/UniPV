package it.unipv.posfw.esercizioBanca.conto;

import java.util.concurrent.ThreadLocalRandom;
import it.unipv.posfw.esercizioBanca.utente.Persona;

public abstract class Conto {
	
	// Parametri
	private String radiceIBanBanca;
	private String iban = null;
	private Persona proprietario;
	private double saldo;
	
	// Costruttori
	public Conto(Persona proprietario) {
		this.proprietario = proprietario;
		saldo = 0;
	}
	
	// Metodi
	public abstract void deposita(double cifra);
	
	public abstract void stampaDettagli();
	
	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getIban() {
		if(iban.equals(null))
			System.out.println("ERRORE: il codice IBAN non è stato ancora assegnato \n");
		return iban;
	}
	
	public void setIban(String radiceIbanBanca) {
		final String SIGLA_NAZIONALE = "IT";
		final String CIN_EU = "69";
		final String CODICE_CIN = "X";
		final String CODICE_ABI = "80085";
		String primaParteContoCorrente = Integer.toString(ThreadLocalRandom.current().nextInt(100000, 1000000));
		String secondaParteContoCorrente = Integer.toString(ThreadLocalRandom.current().nextInt(100000, 1000000));
		
		iban = SIGLA_NAZIONALE + CIN_EU + CODICE_CIN + CODICE_ABI + radiceIbanBanca + primaParteContoCorrente + secondaParteContoCorrente;
	}

	public Persona getProprietario() {
		return proprietario;
	}
	
	public void setRadiceIbanBanca(String radiceIbanBanca) {
		this.radiceIBanBanca = radiceIbanBanca;
	}
}
