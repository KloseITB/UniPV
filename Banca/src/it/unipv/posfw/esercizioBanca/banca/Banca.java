package it.unipv.posfw.esercizioBanca.banca;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import it.unipv.posfw.esercizioBanca.conto.*;
import it.unipv.posfw.esercizioBanca.utente.Persona;

public class Banca {
	
	// Parametri
	private String nome;
	private int numeroContiMassimo;
	private int numeroContiPresenti;
	private LinkedList<Conto> contiLinkedList = new LinkedList<>();
	private HashMap<Persona, Conto> contiHashMap = new HashMap<>();
	private String radiceIban;
	Scanner input = new Scanner(System.in);
	
	// Costruttore
	public Banca(String nomeBanca, int contiMax, String radiceIban) {
		nome = nomeBanca;
		numeroContiMassimo = contiMax;
		numeroContiPresenti = 0;
		this.radiceIban = radiceIban;
	}
	
	// Metodi
	public void aggiungiConto(Conto tipoConto) {
		if(numeroContiPresenti <= numeroContiMassimo) {
		tipoConto.setIban(radiceIban);
		contiLinkedList.add(numeroContiPresenti, tipoConto);
		contiHashMap.put(tipoConto.getProprietario(), tipoConto);
		numeroContiPresenti++;
		}
		else {
			System.out.println("ERRORE: il limite di conti correnti creabili in questa banca è stato raggiunto");
		}
	}
	
	public void operazione(Persona proprietario, TipoOperazione tipoOperazione) {
		Conto conto = contiHashMap.get(proprietario);
		if (conto instanceof ContoCorrente) {
			ContoCorrente contoCorrente = (ContoCorrente) conto;
			
			if(tipoOperazione == TipoOperazione.DEPOSITO) {
				System.out.println("Scrivere la cifra da voler depositare");
				double cifra = Double.parseDouble(input.nextLine());
				contoCorrente.deposita(cifra);
			}
			if(tipoOperazione == TipoOperazione.PRELIEVO) {
				System.out.println("Scrivere la cifra da voler prelevare");
				double cifra = Double.parseDouble(input.nextLine());
				contoCorrente.preleva(cifra);
			}
			if(tipoOperazione == TipoOperazione.STAMPA_DETTAGLI) {
				contoCorrente.stampaDettagli();
			}
		}
		else if (conto instanceof ContoWeb) {
			ContoWeb contoWeb = (ContoWeb) conto;
			
			if(tipoOperazione == TipoOperazione.DEPOSITO) {
				System.out.println("Inserire la password del conto");
				String password = input.nextLine();
				System.out.println("Scrivere la cifra da voler depositare");
				double cifra = Double.parseDouble(input.nextLine());
				contoWeb.deposita(cifra, password);
			}
			if(tipoOperazione == TipoOperazione.PRELIEVO) {
				System.out.println("Inserire la password del conto");
				String password = input.nextLine();
				System.out.println("Scrivere la cifra da voler prelevare");
				double cifra = Double.parseDouble(input.nextLine());
				contoWeb.preleva(cifra, password);
			}
			if(tipoOperazione == TipoOperazione.STAMPA_DETTAGLI) {
				System.out.println("Inserire la password del conto");
				String password = input.nextLine();				
				contoWeb.stampaDettagli(password);
			}
		}
		else if(conto instanceof ContoDeposito) {
			ContoDeposito contoDeposito = (ContoDeposito) conto;
			
			if(tipoOperazione == TipoOperazione.STAMPA_DETTAGLI) {			
				contoDeposito.stampaDettagli();
			}
			
			if(tipoOperazione == TipoOperazione.DEPOSITO) {
				System.out.println("Scrivere la cifra da voler depositare");
				double cifra = Double.parseDouble(input.nextLine());
				contoDeposito.deposita(cifra);
			}
			
			if(tipoOperazione == TipoOperazione.PRELIEVO) {
				System.out.println("ERRORE: impossibile prelevare da un conto deposito. Operazione annullata.");
			}
		}
		else {
			System.out.println("ERRORE: tipo di operazione non valida.\n");
		}
	}
	
	public String getRadiceIban() {
		return radiceIban;
	}
	
	// Main method
	public static void main(String[] args) {
		
		Banca GiacominoBank = new Banca("GiacominoBank", 10, "01234");
		Persona giacomoKozak = new Persona("Giacomo Sbrindullo", "Kozak", "Via Cristoforo Colombo 562", "KZKGCM04R03G388I");
		GiacominoBank.aggiungiConto(new ContoDeposito(giacomoKozak));
		System.out.println(GiacominoBank.contiHashMap.get(giacomoKozak).getIban());
		GiacominoBank.operazione(giacomoKozak, TipoOperazione.PRELIEVO);
	}


}


