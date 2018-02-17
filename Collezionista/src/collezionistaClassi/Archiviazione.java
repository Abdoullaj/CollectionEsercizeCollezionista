package collezionistaClassi;

import java.util.HashMap;

public abstract class Archiviazione {
	
	String [] supportiConsentiti;
	HashMap <String, Creazione> disco;
	
	public Archiviazione() {
		disco = new HashMap<String, Creazione>(1);
	}
	
	
}
