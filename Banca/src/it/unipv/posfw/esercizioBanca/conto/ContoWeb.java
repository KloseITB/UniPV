package it.unipv.posfw.EsercizioBanca.conto;

import java.util.Scanner;

import it.unipv.posfw.EsercizioBanca.utente.Persona;

public class ContoWeb extends Conto{
	
	// Parametri
	boolean isPasswordCambiata = false;
	String password = "changeme";
	
	// Costruttori
	public ContoWeb(Persona proprietario) {
		super(proprietario);
		System.out.println("ATTENZIONE: La password non è stata impostata. Impostarla prima di procedere con altre operazioni");
	}
	
	public ContoWeb(Persona proprietario, String password) {
		super(proprietario);
		this.password = password;
		isPasswordCambiata = true;
	}
	
	// Metodi
	public void deposita(double cifra, String password) {
		
		boolean loginCheck = isLoginCorrect(password);
		
		if(isPasswordCambiata) {
			if(loginCheck) {
				setSaldo(getSaldo() + cifra);
				System.out.println("Operazione avvenuta con successo\n");
			}
			else
				System.out.println("ERRORE: password errata\n");
		}
		else
			System.out.println("ERRORE: prima di effettuare l'accesso, cambia la password del conto\n");
	}
	
	public void stampaDettagli(String password) {
		boolean loginCheck = isLoginCorrect(password);
		
			if(isPasswordCambiata) {
				if(loginCheck) {
					System.out.printf("Il tuo saldo è di: %.2f euro", getSaldo());
				}
				else
					System.out.println("ERRORE: password errata\n");
			}
			else
				System.out.println("ERRORE: prima di effettuare l'accesso, cambia la password del conto\n");
		}
	
	public void preleva(double cifra, String password) {
		boolean loginCheck = isLoginCorrect(password);
		
		if(isPasswordCambiata) {
			if(loginCheck) {
				if (getSaldo() >= cifra) {
					setSaldo(getSaldo() - cifra);
					System.out.println("Operazione avvenuta con successo\n");
				}
				else
				System.out.println("Non disponi di abbastanza liquidità. Operazione abortita. \n");
			}
			else
				System.out.println("ERRORE: password errata\n");
		}
		else
			System.out.println("ERRORE: prima di effettuare l'accesso, cambia la password del conto\n");
	}
	
	public void setPassword(String password) {
		this.password = password;
		isPasswordCambiata = true;
	}
	
	private boolean isLoginCorrect(String password) {
		if(this.password.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void deposita(double cifra) {
		String password = richiestaPassword();
		deposita(cifra, password);
		
	}

	@Override
	public void stampaDettagli() {
		String password = richiestaPassword();
		stampaDettagli(password);
	}
	
	public void preleva(double cifra) {
		String password = richiestaPassword();
		preleva(cifra, password);
	}
	
	public String richiestaPassword() {
		System.out.println("Prima di proseguire, inserire la password del conto\n");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		return password;
	}
}


