package SIMCovid;


import java.awt.BorderLayout;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Page extends JFrame {
	private LinkedList<Umano> persone = new LinkedList<Umano>();
	private LinkedList<Integer> punti = new LinkedList<Integer>();
	private Plot grafico = new Plot(punti);
	
	public Page(LinkedList<Umano> persone) {
		this.persone = persone;
	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(grafico);
		setBounds(0, 0, 400, 400);
	}
	
	public void disegna() {
		System.out.println("start");
		int infetti = 0;
		System.out.println("page punti size " + punti.size());
		System.out.println("persone size " + persone.size());
		for (int i=0; i<persone.size(); i++) {
			System.out.println("uomo " + i + "salute " + persone.get(i).getSalute());
			if(persone.get(i).getSalute() == 1) {
				System.out.println("infetti " + infetti);
				infetti++; 
			}
		}
		System.out.println("totale infetti" + infetti);
		punti.add(infetti);
		grafico.repaint();
		
	}
	
}


