package collezionistaClassi;

import java.util.HashMap;

public class Cd extends Archiviazione{

	public Cd() {
		listaFilm = new HashMap<String, Film  >();
	}
	
	public void supporto(Creazione creazione) {
		int flag = 0;
		if(creazione instanceof Album ) {
			listaFilm.put(creazione.getDettagli().getTitolo() , creazione);
		}
		
	}
	
}
