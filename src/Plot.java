import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Plot extends JPanel{
	
	private LinkedList<Float> punti = new LinkedList<Float>();
	private LinkedList<Float> sani = new LinkedList<Float>();
	private boolean color = true;//true rosso false blue
	public Plot(LinkedList<Float>punti, LinkedList<Float>sani) {
		this.punti = punti;
		this.sani = sani;
	}
	
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		Graphics2D g = (Graphics2D)g2;
		int[] x = new int[punti.size()];
		System.out.println("size punti " + punti.size());
		int salto;
		int pad = 40;//PAD
		int width = getWidth()-pad;
		int heigth = getHeight()-pad;
		if(punti.size()==1) {
			salto = width;
		}
		else if(punti.size()==0) {
			salto = 0;
		}
		else {
			salto = width/(punti.size()-1);
		}
		System.out.println("width " + width);
		System.out.println("heigth " + heigth);
		System.out.println("salto" + salto);
		for (int j=0; j<punti.size() ; j++ ) {
			x[j] = (salto*j)+pad;
			System.out.println("x" + j + " " + x[j]);
		}
		Float max = punti.get(0);
		System.out.println("punti.get(0) " + punti.get(0));
		for (int i=1; i<punti.size(); i++) {
			if(punti.get(i)>max) {
				max=punti.get(i);
			}
		}
		for (int i=0; i<sani.size(); i++) {
			if(sani.get(i)>max) {
				max=sani.get(i);
			}
		}
		System.out.println("max " + max);
		for (int i=0; i<punti.size()-1; i++) {
			System.out.println("sani " + sani.get(i));
			System.out.println("sani+1  " + sani.get(i+1));
			g.setPaint(Color.blue);
			g.drawLine(x[i], (int)Math.abs(((sani.get(i)/max)*heigth)-heigth-1), x[i+1], (int)Math.abs(((sani.get(i+1)/max)*heigth)-heigth-1));
			g.setPaint(Color.red);
			g.drawLine(x[i], (int)Math.abs(((punti.get(i)/max)*heigth)-heigth), x[i+1], (int)Math.abs(((punti.get(i+1)/max)*heigth)-heigth));
			
			
		}
		int pos = 20;
		g.setPaint(Color.black);
		g.drawLine(pad, getHeight()-pad, pad, 0);
		g.drawLine(pad, getHeight()-pad, getWidth(), heigth);
		g.drawString("Umani", 1, pos);//testi sul grafico
		g.drawString("Tempo", width-pos, heigth+pos);//testi sul grafico
		
		
	}
	
}
