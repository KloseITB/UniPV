package it.unipv.posfw.EsercizioBanca.banca;

import java.util.HashMap;
import java.util.LinkedList;
import it.unipv.posfw.EsercizioBanca.conto.*;
import it.unipv.posfw.EsercizioBanca.utente.Persona;

public class Banca {
	
	private String nome;
	private int numeroContiMassimo;
	private int numeroContiPresenti;
	private LinkedList<Conto> contiLinkedList = new LinkedList<>();
	private HashMap<String, String> contiHashMap = new HashMap<>();
	private String radiceIban;
	
	public Banca(String nomeBanca, int contiMax, String radiceIban) {
		nome = nomeBanca;
		numeroContiMassimo = contiMax;
		numeroContiPresenti = 0;
		this.radiceIban = radiceIban;
	}
	
	public void aggiungiConto(Conto tipoConto) {
		if(numeroContiPresenti <= numeroContiMassimo) {
		tipoConto.setIban(radiceIban);
		contiLinkedList.add(numeroContiPresenti, tipoConto);
		contiHashMap.put(tipoConto.getProprietario().getCodiceFiscale(), tipoConto.getIban());
		numeroContiPresenti++;
		}
		else {
			System.out.println("ERRORE: il limite di conti correnti creabili in questa banca è stato raggiunto");
		}
	}
	
	public void operazione(String iban, double importo) {
		
	}
	
	public String getRadiceIban() {
		return radiceIban;
	}
	
	public static void main(String[] args) {
		
		Banca GiacominoBank = new Banca("GiacominoBank", 10, "01234");
		Persona utenteUno = new Persona("Giacomo Sbrindullo", "Kozak", "Via Cristoforo Colombo 562", "KZKGCM04R03G388I");
		GiacominoBank.aggiungiConto(new ContoCorrente(utenteUno));
		System.out.println(GiacominoBank.contiLinkedList.get(0).getIban());
	}


}


