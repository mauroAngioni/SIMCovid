import java.util.LinkedList;

public class Contagio {
	
	public void controlloContagio(GestioneUmani umani) {
		
		for(Umano u: umani) {
			LinkedList<Umano> vicini = umani.Ricerca(u, Main.range);
			
			for(Umano v: vicini) {
				double distance = umani.Distanza(u, v);
				
				double infet = ((Main.infettività / distance)*Main.imp_distanza) + ((100 - u.getDifese())*Main.imp_difese);
				double prob = Math.random()*100;
				
				if(prob <= infet) {
					// Umano infetto
					u.setSalute(1);
				}
			}
		}
	}
	
}
