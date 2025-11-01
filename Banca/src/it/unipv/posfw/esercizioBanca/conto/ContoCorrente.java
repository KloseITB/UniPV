package it.unipv.posfw.esercizioBanca.conto;

import it.unipv.posfw.esercizioBanca.utente.Persona;

public class ContoCorrente extends Conto{
	
	// Costruttori
	public ContoCorrente(Persona proprietario) {
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
	
	public void preleva(double cifra) {
		if (getSaldo() >= cifra) {
			setSaldo(getSaldo() - cifra);
			System.out.println("Operazione avvenuta con successo\n");			
		}
		else
		System.out.println("ERRORE: Non disponi di abbastanza liquidità. Operazione abortita.\n");
	}

}
