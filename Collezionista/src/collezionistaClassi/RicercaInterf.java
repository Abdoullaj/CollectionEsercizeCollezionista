package collezionistaClassi;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public interface RicercaInterf {
	
	public default Collection <Creazione> cercaPerAnnoIntrf(HashMap<String, Creazione> archivio 
				,String [] listaTitoli ,int numeroCreazioniAggiunte,String anno) {
		Collection <Creazione> listaCercata = listaCercata = new HashSet<Creazione>();
		for (int i = 0; i < numeroCreazioniAggiunte ; i++) {
			   Creazione current = archivio.get(listaTitoli[i]);
		       String  annoPubblicazione = (String)current.getDettagli().get("anno");
		       if (annoPubblicazione.equals(anno)){
		    	   listaCercata.add(current);
		       }
		}
		return listaCercata;
	}
	
	public default Collection <Creazione> cercaIntrf(HashMap<String, Creazione> archivio ,String [] listaTitoli,
					String tipoRicerca,String valoreTipo,int numeroCreazioniAggiunte) {
		Collection <Creazione> listaCercata = listaCercata = new HashSet<Creazione>();
		 for (int i = 0; i < numeroCreazioniAggiunte ; i++) {
			   Creazione current = archivio.get(listaTitoli[i]);
		       String [] listaRicerca = (String [])current.getListaDettagli().get(tipoRicerca);
		       if (listaRicerca != null) {
		    	   int lunghezzaGeneri = listaRicerca.length;
			       for (int k = 0; k < lunghezzaGeneri; k++ ) {
			        	if (listaRicerca[k] == valoreTipo) {
			        		listaCercata.add(current);
			        	}
			       }
		       }
		 }
		 return listaCercata;
	}
	
	public default Creazione ritornaOggettoCastatoIntrf(Creazione creazione) {
		if (creazione instanceof Film)
			return (Film)creazione;
		if (creazione instanceof Album)
			return (Album)creazione;
		else {
			return null;
		}
	}
}
