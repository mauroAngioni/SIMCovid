import java.util.LinkedList;

public class Contagio {
	
	public void controlloContagio(LinkedList<Umano> umani) {
		double range = 10; // parametro main
		double[] infettivita_generale = new double[3]; // parametro main in percentuale per fascia d'età
		int[] range_eta = new int[2]; // parametro main fascia d'età
		double imp_difese = 0.2; // parametro main 0-1
		double imp_distanza = 0.2; // parametro main 0-1
		
		for(Umano u: umani) {
			LinkedList<Umano> vicini = ricerca(u, range);
			
			for(Umano v: vicini) {
				double distance = u.getDist(v);
				
				double infettivita = 100;
				if(u.getEta() <= range_eta[0]) {
					infettivita = infettivita_generale[0]; // prima fascia d'età
				}else if(u.getEta() > range_eta[0] && u.getEta() <= range_eta[1]) {
					infettivita = infettivita_generale[1]; // seconda fascia d'et�
				}else {
					infettivita = infettivita_generale[2]; // terza fascia d'età
				}
				
				double infet = ((infettivita / distance)*imp_distanza) + ((100 - u.getDifese())*imp_difese);
				double prob = Math.random()*100;
				
				if(prob <= infet) {
					// Umano infetto
					u.setMalato(true);
				}
			}
		}
	}
	
	private LinkedList<Umano> ricerca(Umano u, double range) {
		// metodo del gruppo 7 (rosso)
		return new LinkedList<Umano>();
	}
	
}
