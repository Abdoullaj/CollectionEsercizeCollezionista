package collezionistaClassi;

import java.util.HashMap;

public class DVD extends Archiviazione{

	public DVD() {
		listaFilm = new HashMap<String, Film  >();
	}
	
	public void supporto(Creazione creazione) {
		int flag = 0;
		if(creazione instanceof Film || creazione instanceof Film Album) {
			listaFilm.put(creazione.getDettagli().getTitolo() , creazione);
		}
		
	}
	
}
