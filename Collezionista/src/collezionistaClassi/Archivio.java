package collezionistaClassi;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;

public class Archivio {
	
	HashMap<String, Film> listaFilm;
	Collection <Film> listaFilmCercata ;
	String [] listaTitoliFilm = new String [20];
	int numeroFilmAggiunti = 0;
	
	HashMap<String, Album> listaAlbum;
	Collection <Album> listaAlbumCercata ;
	String [] listaTitoliAlbum = new String [20];
	int numeroAlbumAggiunti = 0;
	
	HashMap<String, HashMap> archivio;
	public Archivio () {
		
		listaFilm = new HashMap<String, Film>();
		listaFilmCercata = new HashSet<Film>();
		
		archivio = new HashMap<String, HashMap>();
		archivio.put("film", listaFilm);
		archivio.put("album", listaAlbum);
	}
	
	public void aggiungiCreazione(Creazione creazione) {
		String titolo = (String) creazione.getDettagli().get("titolo");
		if (creazione instanceof Film) {
			Film film = (Film) creazione;
		listaFilm.put(titolo, film);
		listaTitoliFilm[numeroFilmAggiunti] = titolo;
		numeroFilmAggiunti++;
		}
		
		if (creazione instanceof Album) {
			Album album = (Album) creazione;
			listaAlbum.put(titolo, album);
			listaTitoliAlbum[numeroAlbumAggiunti] = titolo;
			numeroAlbumAggiunti++;
		}
		
	}
	
	public HashMap getMapFilm () {
		return listaFilm;
	}
	
	public Collection getListaFilmCercata() {
		return listaFilmCercata;
	}
	
	public HashMap getMapAlbum() {
		return listaFilm;
	}
	
	public Collection getListaAlbumCercata() {
		return listaFilmCercata;
	}
	
	public Film cercaFilmPerNome(String nome) {
		
		return listaFilm.get(nome);
		
	}
	

	
	public void cercaFilm(String tipoRicerca,String valoreTipo) {
		 for (int i = 0; i < numeroFilmAggiunti ; i++) {
			 	Film currentFilm = listaFilm.get(listaTitoliFilm[i]);
		       String [] listaGeneriFilm = (String [])currentFilm.getListaDettagli().get(tipoRicerca);
		       int lunghezzaGeneri = listaGeneriFilm.length;
		       for (int k = 0; k < lunghezzaGeneri; k++ ) {
		        	if (listaGeneriFilm[k] == valoreTipo) {
		        		listaFilmCercata.add(currentFilm);
		        		System.out.println(tipoRicerca+": "+valoreTipo+" nel film: "+currentFilm.getDettagli().get("titolo"));
		        	}
		       }
		 }
	}
		
	
	public Film cercaFilmPerNomeDaListaTrovata (String nome) {
			
			Iterator <Film> iterator = listaFilmCercata.iterator();   
			
			System.out.println("Preparazione ciclo");
			while ( iterator.hasNext() ) {
				System.out.println("Inizio ciclo");
				Film primo ;
				primo = iterator.next();
				if( primo.equals(nome) ) {
					System.out.println(primo.getDettagli().get("titolo")+" è stato preso");
					return primo;
				}
			 }
			
			return null;
		}
	
	public void stampaCollection () {
		System.out.println("\nINIZIO CICLO STAMPA ITERATOR \n");
		 
		Iterator <Film> iterator = listaFilmCercata.iterator();  
		while ( iterator.hasNext() ) {
			System.out.println("ciclo iniziato");
			Film primo = iterator.next();
				System.out.println(primo.getDettagli().get("titolo"));
		 }
		
		System.out.println("\nFINE CICLO STAMPA ITERATOR \n");
	}
	
	public void stampaTitoli () {
		for (int i = 0; i < numeroFilmAggiunti ; i++) {
			System.out.println("Da lista titoli: "+listaTitoliFilm[i]);
		}
	}
	
	
//	public Collection cercaFilmPerGenere(String genere) {
//	Iterator iterator =  listaFilm.entrySet().iterator(); 
//	
//	System.out.println("Preparazione ricerca per genere.");
//	while(iterator.hasNext()) {
//		System.out.println("Inizio ricerca per genere.");
//
//       Film currentFilm = (Film)iterator.next();
//		System.out.println("CREATO ITERATORE ricerca per genere.");
//
//       String [] listaGeneriFilm = (String [])currentFilm.getListaDettagli().get("genere");
//       int lunghezzaGeneri = listaGeneriFilm.length;
//        for (int i = 0; i < lunghezzaGeneri; i++ ) {
//        	System.out.println("In cerca di un film con quel genere");
//        	if (listaGeneriFilm[i] == genere) {
//        		listaFilmCercata.add(currentFilm);
//        		System.out.println("Trovato genere"+currentFilm.getDettagli().get("titolo"));
//        	}
//        }
//	}
//	return listaFilmCercata;
//}
//public Film cercaFilmPerNomeDaListaTrovata(String nome) {
//
//
//	Iterator <Film> iterator = listaFilmCercata.iterator();   
//	
//	while ( iterator.hasNext() ) {
//		Film primo  = iterator.next();
//		if( primo.equals(nome) ) {
//			System.out.println(primo.getDettagli().get("titolo")+" è stato preso");
//			return primo;
//		}
//	 }
//	return listaFilm.get(nome);
//	
//}
	

}
