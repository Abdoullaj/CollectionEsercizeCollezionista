package collezionistaClassi;


public class DVD extends Archiviazione{

	
	public DVD() {
		super();
	}
	
	public boolean supporto(Creazione creazione) {
		if((creazione instanceof Film) || (creazione instanceof Album)) {
			disco.put((String)creazione.getDettagli().get("titolo") , creazione);
			return true;
		}
		return false;
		
	}
	
}
