import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.LinkedList;
public class SampleComponent extends JPanel {
	
	private GestioneUmani ListaUmani;
    
    public SampleComponent(GestioneUmani umani) {
    	this.ListaUmani = umani;
    }

    public void paintComponent(Graphics g) {
    	int raggio = 10;
    	
    	super.paintComponent(g);
    	for(Umano u: ListaUmani) {
    		if (u.getSalute()==0) {
    			g.setColor(Color.BLACK);
    		}else {      
    			g.setColor(Color.RED);
    			}
    		g.fillOval((u.getX()*raggio)+raggio, (u.getY()*raggio)+raggio, raggio, raggio);
			}
    	}

}
