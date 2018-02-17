package collezionistaClassi;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nomi  = {"primo", "secondo"};
		String [] nomi2  = {"terzo", "quarto"};
		TreeMap<String, String[]> dettagli = new TreeMap<String, String [] >();
		dettagli.put("nome", nomi);
		System.out.println("Il nome del film risulta:" +dettagli.get("nome")[0]);
		dettagli.put("nome", nomi2);
		System.out.println("Il nome del film risulta:" +dettagli.get("nome")[0]);
		
		for (int i = 0; i < dettagli.size(); i++) {
			System.out.println(dettagli.);
		}
	}

}
