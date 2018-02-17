package collezionistaClassi;

import java.util.HashMap;

public class BluRay extends Archiviazione{
	
	String [] supportiConsentiti;
	
	public BluRay() {
		listaFilm = new HashMap<String, Film  >();
	}
	
	
	public void supporto(Creazione creazione) {
		int flag = 0;
		if(creazione instanceof Film ) {
			listaFilm.put(creazione.getDettagli().getTitolo() , creazione);
		}
		
	}


}
