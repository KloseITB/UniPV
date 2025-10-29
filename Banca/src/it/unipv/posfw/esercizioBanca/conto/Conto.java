package it.unipv.posfw.EsercizioBanca.conto;

import java.util.concurrent.ThreadLocalRandom;
import it.unipv.posfw.EsercizioBanca.utente.Persona;

public abstract class Conto {
	
	private String radiceIBanBanca;
	private String iban = null;
	private Persona proprietario;
	private double saldo;
	private boolean isContoWeb = false;
	
	public Conto(Persona proprietario) {
		this.proprietario = proprietario;
		saldo = 0;
	}
	
	public abstract void deposita(double cifra);
	
	public abstract void stampaDettagli();
	
	public void setIsContoWeb(boolean isContoWeb) {
		this.isContoWeb = isContoWeb;
	}
	
	public boolean getIsContoWeb() {
		return isContoWeb;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
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
