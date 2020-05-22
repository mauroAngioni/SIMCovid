package SIMCovid;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Page extends JFrame {
	private ArrayList<Umano> persone = new ArrayList<Umano>();
	private ArrayList<Integer> punti = new ArrayList<Integer>();
	private Plot grafico = new Plot(punti);
	
	public Page(ArrayList<Umano> persone) {
		this.persone = persone;
	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(grafico);
		setBounds(0, 0, 100, 100);
		punti.add(1);
	}
	
	public void disegna() {
		int infetti = 0;
		for (int i=0; i<punti.size(); i++) {
			if(persone.get(i).getSalute() == 1) {
				infetti++; 
			}
		}
		System.out.println(infetti);
		punti.add(infetti);
		grafico.repaint();
		
	}
	
}


