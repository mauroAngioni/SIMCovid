package covid;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.util.LinkedList;
public class SampleComponent extends JComponent {


    private Color[] colors = { Color.RED, Color.ORANGE , Color.BLACK };

public void paintComponent(Graphics g ,LinkedList <Umano> ListaUmani ) {
	
    // Calcola il diametro a partire dalle dimensioni del componente
    Dimension size = getSize();
	for(int i=0;i<ListaUmani.size();i++) {
        // sceglie a rotazione il colore
    if (ListaUmani.get(i).getSalute()==0) {
        g.setColor(Color.black);
        // Calcola le coordinate del cerchio
        g.fillOval(ListaUmani.get(i).getX(),ListaUmani.get(i).getY(),10, 10);
    }else {      
    g.setColor(Color.RED);
    g.fillOval(ListaUmani.get(i).getX(),ListaUmani.get(i).getY(),10, 10);
    }
	}
    }

}


