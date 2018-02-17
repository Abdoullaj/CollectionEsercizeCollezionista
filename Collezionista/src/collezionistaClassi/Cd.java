package collezionistaClassi;


public class Cd extends Archiviazione{

	public Cd() {
		super();
	}
	
	public boolean supporto(Creazione creazione) {
		
		if(creazione instanceof Album ) {
			disco.put((String)creazione.getDettagli().get("titolo") , creazione);
			return true;
			}
		return false;
	}
	
}
