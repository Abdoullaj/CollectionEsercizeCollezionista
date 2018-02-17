package collezionistaClassi;

public class Album extends Creazione {

	
	public Album (String titolo,String anno, String [] listaCantanti,
			String[] listaGenere, String[] listaSupporto) {
		super(titolo,anno,listaGenere,listaSupporto);
		listaDettagli.put("cantanti", listaCantanti);
	}
	
	public String toString() {
		return "\nTitolo: "+(String)dettagli.get("titolo");
	}
}
