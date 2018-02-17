package collezionistaClassi;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

	
	public static double ritornaNumeroCastato (double numero) {
		return (int)numero;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Archivio diCasaMia = new Archivio();
		
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
		
		String [] listaCantanti = {"Kendrick","Trevis","Migos"};
		String [] listaGenereAlbum = {"Rap","HipHop"};
		String [] listaSupportoAlbum = {"DVD","BluRay"};
		
		String [] listaCantanti2 = {"Frank","Scott"};
		String [] listaGenereAlbum2 = {"Rap2","HipHop2"};
		String [] listaSupportoAlbum2 = {"DVD","BluRay2"};
		
		Album kendrick = new Album("Kendrick","2018",listaCantanti,listaGenereAlbum,listaSupportoAlbum);
		Album frank = new Album("Frank","20182",listaCantanti2,listaGenereAlbum2,listaSupportoAlbum2);
		
		diCasaMia.aggiungiCreazione(memento,memento2,kendrick,frank);
		System.out.println("\nRICERCA PER TITOLO: MEMENTO\n");
		System.out.println(diCasaMia.cercaPerTitolo("Memento").getDettagli().get("titolo"));  
		
		System.out.println("\nRICERCA PER GENERE: HIP HOP2\n");
		diCasaMia.cerca("genere", "HipHop2");
		diCasaMia.stampaCollection();
		
		System.out.println("\nRICERCA PER SUPPORTO: DVD\n");
		diCasaMia.cerca("supporto", "DVD");
		diCasaMia.stampaCollection();
		
		System.out.println("\nRICERCA PER REGISTA: NOLAN \n");
		diCasaMia.cerca("registi", "Nolan2");
		diCasaMia.stampaCollection();
		
		System.out.println("\nRICERCA PER ANNO: 2018 ");
		diCasaMia.cercaPerAnno("2018");
		diCasaMia.stampaCollection();
		
		System.out.println("\nRICERCA PER ARTISTA: FRANK ");
		diCasaMia.cerca("cantanti","Frank");
		diCasaMia.stampaCollection();
		DVD dvd = new DVD();
		Cd cd = new Cd();
		BluRay bluray = new BluRay();
		System.out.println(bluray.supporto(frank));
		System.out.println(dvd.supporto(frank));
		System.out.println(cd.supporto(memento));
	}

}
