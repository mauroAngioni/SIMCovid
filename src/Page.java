import java.awt.BorderLayout;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Page extends JFrame {
	private GestioneUmani persone;
	private LinkedList<Float> malati = new LinkedList<Float>();
	private LinkedList<Float> sani = new LinkedList<Float>();
	private Plot grafico = new Plot(malati, sani);
	
	public Page(GestioneUmani persone) {
		this.persone = persone;
	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(grafico);
		setBounds(0, 0, 400, 400);
	}
	
	public void disegna() {
		
		float infetti = 0;
		float sani = 0;
		for (int i=0; i<persone.size(); i++) {
			if(persone.get(i).getSalute() == 1) {
				infetti++; 
			}
			else {
				sani++;
			}
		}
		
		this.sani.add(sani);
		malati.add(infetti);
		grafico.repaint();
		
	}
	
}


