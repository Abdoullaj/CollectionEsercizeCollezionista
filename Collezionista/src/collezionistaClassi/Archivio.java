package collezionistaClassi;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;

public class Archivio implements RicercaInterf {
	
	HashMap<String, Creazione> archivio;
	Collection <Creazione> listaCercata ;
	private int numeroCreazioniAggiunte = 0;
	String [] listaTitoli = new String [20];
	
	
	public Archivio () {
		
		archivio = new HashMap<String,Creazione>();
		listaCercata = new HashSet<Creazione>();
	}
	
	public void aggiungiCreazione(Creazione ...creazione) {
		for (Creazione temp : creazione) {
			String titolo = (String) temp.getDettagli().get("titolo");
			archivio.put(titolo, temp);
			listaTitoli[numeroCreazioniAggiunte] = titolo;
			numeroCreazioniAggiunte++;
		}
	}
	public void rimuoviCreazione(Creazione ...creazione) {
		for (Creazione temp : creazione) {
			String titolo = (String) temp.getDettagli().get("titolo");
			archivio.remove(titolo);
			listaTitoli[numeroCreazioniAggiunte] = titolo;
			numeroCreazioniAggiunte--;
		}
	}
	
	public Creazione cercaPerTitolo(String titolo) {
		Creazione creazione = archivio.get(titolo);
		return ritornaOggettoCastatoIntrf(creazione);
	}
	
	public void cercaPerAnno(String anno) {
		listaCercata = cercaPerAnnoIntrf(archivio,listaTitoli,numeroCreazioniAggiunte, anno);
	}
	
	public void cerca(String tipoRicerca,String valoreTipo) {
		listaCercata = cercaIntrf(archivio,listaTitoli,tipoRicerca,valoreTipo,numeroCreazioniAggiunte);
	}
	
	
	public Creazione prendiDaLista (String nome) {
		
		Iterator <Creazione> iterator = listaCercata.iterator();   
		
		System.out.println("Preparazione ciclo");
		while ( iterator.hasNext() ) {
			System.out.println("Inizio ciclo");
			Creazione primo  = iterator.next();
			if( primo.equals(nome)) {
				System.out.println(primo.getDettagli().get("titolo")+" è stato preso");
				return ritornaOggettoCastatoIntrf(primo);
			}
		 }
		return null;
	}
	
	
	public HashMap getMap () {
		return archivio;
	}
	 
	public Collection getListaCreazioneCercata() {
		return listaCercata;
	}
	
	public void stampaCollection () {
		 System.out.println("Stampa in corso ...");
		Iterator <Creazione> iterator = listaCercata.iterator();  
		while ( iterator.hasNext() ) {
			Creazione primo = iterator.next();
				System.out.println(primo.getDettagli().get("titolo"));
		 }
	}
	
	public void stampaTitoli () {
		for (int i = 0; i < numeroCreazioniAggiunte ; i++) {
			System.out.println("Da lista titoli: "+listaTitoli[i]);
		}
	}
	

	
	

}
