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
		System.out.println("size punti " + punti.size());
		int salto;
		if(punti.size()==1) {
			salto = getWidth();
		}
		else if(punti.size()==0) {
			salto = 0;
		}
		else {
			salto = getWidth()/(punti.size()-1);
		}
		System.out.println("width " + getWidth());
		System.out.println("salto" + salto);
		for (int j=0; j<punti.size() ; j++ ) {
			x[j] = salto*j;
			System.out.println("x" + j + " " + x[j]);
		}
		int max = punti.get(0);
		for (int i=1; i<punti.size(); i++) {
			if(punti.get(i)>max) {
				max=punti.get(i);
			}
		}
		for (int i=1; i<punti.size(); i++) {
			punti.set(i, (punti.get(i)/max)*getHeight());
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
			g.drawString("Prova testo", 10, 10);//testi sul grafico
			
		}
		
		
	}
	
}