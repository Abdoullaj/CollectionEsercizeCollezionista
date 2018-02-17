package collezionistaClassi;


public class BluRay extends Archiviazione{
	
	String [] supportiConsentiti;
	
	public BluRay() {
		super();
	}
	
	public boolean supporto(Creazione creazione) {
		if(creazione instanceof Film ) {
			disco.put((String)creazione.getDettagli().get("titolo") , creazione);
			return true;
			}
		return false;
	}


}
