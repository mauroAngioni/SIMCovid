package SIMCovid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Plot extends JPanel{
	
	private LinkedList<Integer> punti = new LinkedList<Integer>();
	private boolean color = true;//true rosso false blue
	public Plot(LinkedList<Integer>punti) {
		this.punti = punti;
	}
	
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		Graphics2D g = (Graphics2D)g2;
		int[] x = new int[punti.size()];
		System.out.println(punti.size());
		int salto = getWidth()/punti.size();
		System.out.println(punti.size());
		System.out.println(getWidth());
		System.out.println(salto);
		for (int j=0; j<punti.size() ; j++ ) {
			x[j] = salto*j;
			System.out.println("x" + j + " " + x[j]);
		}
		for (int i=0; i<punti.size()-1; i++) {
			if(color == true) {
				g.setPaint(Color.blue);
				color = !color;
			}
			else {
				g.setPaint(Color.red);
				color = !color;
			}
			System.out.println(color);
			g.drawLine(x[i], punti.get(i), x[i+1], punti.get(i+1));
			
		}
		
		
	}
	
}
