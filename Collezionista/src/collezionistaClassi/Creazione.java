package collezionistaClassi;

import java.util.HashMap;

public abstract class Creazione {

	HashMap<String, String> dettagli;
	/***************
	 * 								titolo : titolo
	 * 								anno : anno
	 */
	HashMap<String, String[]> listaDettagli;
	/***************
	 * 							listaGenere : listaGenere []
	 * 							listaSupporto : listaSupporto []
	 * 
	 * 				Film 					||				Album
	 * listaAttori : listaAttori []			||	listaCantanti : listaCantanti []
	 * listaRegisti : listaRegisti []
	 * 
	 */
	public Creazione (String titolo,String anno,String [] listaGenere,String [] listaSupporto) {
		
		listaDettagli = new HashMap<String, String []>(3);
		dettagli = new HashMap<String, String >(3);
		
		dettagli.put("titolo", titolo);
		dettagli.put("anno", anno);
		
		listaDettagli.put("genere", listaGenere);
		listaDettagli.put("supporto", listaSupporto);
	}
	

	public HashMap getDettagli () {
		return dettagli;
	}
	
	public HashMap getListaDettagli () {
		return listaDettagli;
	}
	
	public boolean equals (String titolo) {
		return (dettagli.get("titolo") == titolo);
	}
	
}
