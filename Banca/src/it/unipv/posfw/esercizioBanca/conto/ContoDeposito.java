package it.unipv.posfw.esercizioBanca.conto;

import it.unipv.posfw.esercizioBanca.utente.Persona;

public class ContoDeposito extends Conto{
	
	// Costruttori
	public ContoDeposito(Persona proprietario) {
		super(proprietario);
	}
	
	// Metodi
	@Override
	public void deposita(double cifra) {
		setSaldo(getSaldo() + cifra);
		
	}

	@Override
	public void stampaDettagli() {
		System.out.printf("Il tuo saldo è di: %.2f euro\n", getSaldo());
	}

}
