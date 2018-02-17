package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import collezionistaClassi.Album;
import collezionistaClassi.Archivio;
import collezionistaClassi.Film;

class TestCollezionista {

	
	// Film
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
	
	

	// Archivio 
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
		diCasaMia.aggiungiCreazione(memento);
		assert(diCasaMia.getMapFilm().get("Memento")== memento);
	}
	
	@Test
	void testArchivio2() {
		diCasaMia.aggiungiCreazione(memento2);
		assert(diCasaMia.getMapFilm().get("Memento2")== memento2);
	}
	
	@Test
	void testgetFilmDaNome() {
		diCasaMia.aggiungiCreazione(memento);
		diCasaMia.aggiungiCreazione(memento2);
		assert(diCasaMia.cercaFilmPerNome("Memento") == memento);
	}
	
	@Test
	void testgetFilmDaGenere() {
		diCasaMia.aggiungiCreazione(memento);
		diCasaMia.aggiungiCreazione(memento2);
		diCasaMia.cercaFilm("genere","drammatico2");
		assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento2") == memento2);
	}
	
	@Test
	void testgetFilmDaAttori() {
		diCasaMia.aggiungiCreazione(memento);
		diCasaMia.aggiungiCreazione(memento2);
		diCasaMia.cercaFilm("attori","attore1");
		assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento") == memento);
	}
	
	@Test
	void testgetFilmDaSupporto() {
		diCasaMia.aggiungiCreazione(memento);
		diCasaMia.aggiungiCreazione(memento2);
		diCasaMia.cercaFilm("supporto","DVD2");
		assert(diCasaMia.cercaFilmPerNomeDaListaTrovata( "Memento2") == memento2);
	}
	
	// Album 
	
	String [] listaCantanti = {"Kendrick","Trevis","Migos"};
	String [] listaGenereAlbum = {"Rap","HipHop"};
	String [] listaSupportoAlbum = {"DVD","BluRay"};
	
	String [] listaCantanti2 = {"Lamar","Scott"};
	String [] listaGenereAlbum2 = {"Rap2","HipHop2"};
	String [] listaSupportoAlbum2 = {"DVD2","BluRay2"};
	
	Album kendrick = new Album("Kendrick","2018",listaCantanti,listaGenereAlbum,listaSupportoAlbum);
	Album ff = new Album("Frank","20182",listaCantanti2,listaGenereAlbum2,listaSupportoAlbum2);
	
	
	// TEST ALBUM 
		@Test
		void testCreazioneAlbumEaggiuntaTitolo() {
			
			assert(kendrick.getDettagli().get("titolo") == "Kendrick");
		}
		
		@Test
		void testAnnoAlbum() {
			assert(kendrick.getDettagli().get("anno") == "2018");
		}
		
		@Test
		void testCantantiAlbum() {
			String [] parola =(String []) kendrick.getListaDettagli().get("cantanti") ;
			assert(parola[1] == "Trevis");
		}
		
		
		@Test
		void testGenereAlbum() {
			String [] parola =(String []) kendrick.getListaDettagli().get("genere") ;
			assert(parola[0] == "Rap");
		}
		
		@Test
		void testArchivioAlbum() {
			diCasaMia.aggiungiCreazione(kendrick);
			assert(diCasaMia.getMapFilm().get("Memento")== memento);
		}
		
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

