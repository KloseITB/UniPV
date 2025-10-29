package it.unipv.posfw.EsercizioBanca.conto;

import it.unipv.posfw.EsercizioBanca.utente.Persona;

public class ContoCorrente extends Conto{

	public ContoCorrente(Persona proprietario) {
		super(proprietario);

	}

	@Override
	public void deposita(double cifra) {
		setSaldo(getSaldo() + cifra);
	}
	
	@Override
	public void stampaDettagli() {
		System.out.printf("%.2f", getSaldo());
	}
	
	public void preleva(double cifra) {
		if (getSaldo() >= cifra)
		setSaldo(getSaldo() - cifra);
		else
		System.out.println("Non disponi di abbastanza liquidità. Operazione abortita. \n");
	}

}
