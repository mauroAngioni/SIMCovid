package SIMCovid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Plot extends JPanel{
	
	private ArrayList<Integer> punti = new ArrayList<Integer>();
	
	public Plot(ArrayList<Integer>punti) {
		this.punti = punti;
	}
	
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		Graphics2D g = (Graphics2D)g2;
		g.setPaint(Color.blue);
		int[] x = new int[punti.size()];
		System.out.println(punti.size());
		int salto = getWidth()/punti.size();
		for (int j=0; j<punti.size() ; j++ ) {
			x[j] = salto*j;
		}
		for (int i=0; i<punti.size()-1; i++) {
			g.drawLine(x[i], punti.get(i), x[i+1], punti.get(i+1));
			
		}
		
		
	}
	
}
