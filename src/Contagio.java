import java.util.LinkedList;

public class Contagio {
	
	public void controlloContagio(LinkedList<Umano> umani) {
		GestioneUmani gu = new GestioneUmani(umani);
		
		int range = 10; // parametro main
		double infettivita = Main.infettività; 
		double imp_difese = 0.2; // parametro main 0-1
		double imp_distanza = 0.2; // parametro main 0-1
		
		for(Umano u: umani) {
			LinkedList<Umano> vicini = gu.Ricerca(u, range);
			
			for(Umano v: vicini) {
				double distance = gu.Distanza(u, v);
				
				double infet = ((infettivita / distance)*imp_distanza) + ((100 - u.getDifese())*imp_difese);
				double prob = Math.random()*100;
				
				if(prob <= infet) {
					// Umano infetto
					u.setSalute(1);
				}
			}
		}
	}
	
}
