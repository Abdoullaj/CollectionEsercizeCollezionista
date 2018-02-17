package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import collezionistaClassi.Archivio;
import collezionistaClassi.Film;

class TestCollezionista {

	String [] listaRegisti = {"Nolan","Linch","Tarantino"};
	String [] listaAttori = {"attore1","attore2"};
	String [] listaGenere = {"thriller","drammatico", "fantasy"};
	String [] listaSupporto = {"DVD","CD"};
	
	String [] listaRegisti2 = {"Nolan2","Linch2","Tarantino2"};
	String [] listaAttori2 = {"attore12","attore22"};
	String [] listaGenere2 = {"thriller2","drammatico2", "fantasy2"};
	String [] listaSupporto2 = {"DVD2","CD2"};
	
	Film memento = new Film("Memento","1998",listaRegisti,listaAttori,listaGenere,listaSupporto);
	Film memento2 = new Film("Memento2","19982",listaRegisti2,listaAttori2,listaGenere2,listaSupporto2);
	
	Archivio diCasaMia = new Archivio();
	
	
	
	// TEST FILM 
	@Test
	void testCreazioneFilmEaggiuntaTitolo() {
		
		assert(memento.getDettagli().get("titolo") == "Memento");
	}
	
	@Test
	void testAnno() {
		assert(memento.getDettagli().get("anno") == "1998");
	}
	
	@Test
	void testRegisti() {
		String [] parola =(String []) memento.getListaDettagli().get("registi") ;
		assert(parola[1] == "Linch");
	}
	
	@Test
	void testAttori() {
		String [] parola =(String []) memento.getListaDettagli().get("attori") ;
		assert(parola[1] == "attore2");
	}
	
	@Test
	void testGenere() {
		String [] parola =(String []) memento.getListaDettagli().get("genere") ;
		assert(parola[1] == "drammatico");
	}
	

	
	@Test
	void testArchivio() {
		diCasaMia.aggiungiFilm(memento);
		assert(diCasaMia.getMapFilm().get("Memento")== memento);
	}
	
	@Test
	void testArchivio2() {
		diCasaMia.aggiungiFilm(memento2);
		assert(diCasaMia.getMapFilm().get("Memento2")== memento2);
	}
	
	@Test
	void testgetFilmDaNome() {
		diCasaMia.aggiungiFilm(memento);
		diCasaMia.aggiungiFilm(memento2);
		assert(diCasaMia.cercaFilmPerNome("Memento") == memento);
	}
	
	@Test
	void testgetFilmDaGenere() {
		diCasaMia.aggiungiFilm(memento);
		diCasaMia.aggiungiFilm(memento2);
		diCasaMia.cercaFilm("genere","drammatico2");
		assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento2") == memento2);
	}
	
	@Test
	void testgetFilmDaAttori() {
		diCasaMia.aggiungiFilm(memento);
		diCasaMia.aggiungiFilm(memento2);
		diCasaMia.cercaFilm("attori","attore1");
		assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento") == memento);
	}
	
	@Test
	void testgetFilmDaSupporto() {
		diCasaMia.aggiungiFilm(memento);
		diCasaMia.aggiungiFilm(memento2);
		diCasaMia.cercaFilm("supporto","DVD2");
		assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento2") == memento2);
	}
//	
//	// TEST ALBUM 
//		@Test
//		void testCreazioneAlbumEaggiuntaTitolo() {
//			
//			assert(memento.getDettagli().get("titolo") == "Memento");
//		}
//		
//		@Test
//		void testAnnoAlbum() {
//			assert(memento.getDettagli().get("anno") == "1998");
//		}
//		
//		@Test
//		void testCantantiAlbum() {
//			String [] parola =(String []) memento.getListaDettagli().get("registi") ;
//			assert(parola[1] == "Linch");
//		}
//		
//		
//		@Test
//		void testGenereAlbum() {
//			String [] parola =(String []) memento.getListaDettagli().get("genere") ;
//			assert(parola[1] == "drammatico");
//		}
//		
//
//		
//		@Test
//		void testArchivioAlbum() {
//			diCasaMia.aggiungiFilm(memento);
//			assert(diCasaMia.getMapFilm().get("Memento")== memento);
//		}
//		
//		@Test
//		void testArchivio2Album() {
//			diCasaMia.aggiungiFilm(memento2);
//			assert(diCasaMia.getMapFilm().get("Memento2")== memento2);
//		}
//		
//		@Test
//		void testgetAlbumDaNome() {
//			diCasaMia.aggiungiFilm(memento);
//			diCasaMia.aggiungiFilm(memento2);
//			assert(diCasaMia.cercaFilmPerNome("Memento") == memento);
//		}
//		
//		@Test
//		void testgetAlbumDaGenere() {
//			diCasaMia.aggiungiFilm(memento);
//			diCasaMia.aggiungiFilm(memento2);
//			diCasaMia.cercaFilm("genere","drammatico2");
//			assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento2") == memento2);
//		}
//		
//		@Test
//		void testgetAlbumDaAttori() {
//			diCasaMia.aggiungiFilm(memento);
//			diCasaMia.aggiungiFilm(memento2);
//			diCasaMia.cercaFilm("attori","attore1");
//			assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento") == memento);
//		}
//		
//		@Test
//		void testgetAlbumDaSupporto() {
//			diCasaMia.aggiungiFilm(memento);
//			diCasaMia.aggiungiFilm(memento2);
//			diCasaMia.cercaFilm("supporto","DVD2");
//			assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento2") == memento2);
//		}

	
	
	
	
	
	
	
	
	
	
	
	
}

