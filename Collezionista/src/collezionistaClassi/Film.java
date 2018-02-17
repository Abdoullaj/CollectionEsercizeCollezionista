package collezionistaClassi;

public class Film extends Creazione {
	
	public Film (String titolo,String anno, String [] listaRegisti,
			String [] listaAttori, String[] listaGenere, String[] listaSupporto) {
		super(titolo,anno,listaGenere,listaSupporto);
		listaDettagli.put("registi", listaRegisti);
		listaDettagli.put("attori", listaAttori);
	}
	
	public String toString() {
		return "\nTitolo: "+(String)dettagli.get("titolo");
	}
	
	
}
