import java.util.LinkedList;

public class Contagio {
	
	public void controlloContagio(LinkedList<Umano> umani) {
		double range = 10; // parametro main
		double infettivita = 1; // parametro main in percentuale
		
		for(Umano u: umani) {
			LinkedList<Umano> vicini = ricerca(u, range);
			
			for(Umano v: vicini) {
				double distance = u.getDist(v);
				double infet = infettivita / distance;
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
