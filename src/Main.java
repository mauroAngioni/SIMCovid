import java.util.Scanner;


import javax.swing.JFrame;
import java.util.LinkedList;
import java.util.Locale;

import javax.swing.JFrame;

class Main {


  static public int range;
  static public double infettività;
  static public double imp_difese;
  static public double imp_distanza;


  public static void main(String[] args) throws InterruptedException{

  	GestioneUmani umani = new GestioneUmani();
  	Contagio c = new Contagio();

  	Mondo m = new Mondo(20, 20);
  	TestMovimento T = new TestMovimento(umani, m);

    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);
    
    System.out.println("Range: ");
    range = input.nextInt();

    System.out.println("Infettività: ");
    infettività = input.nextDouble();

    System.out.println("Importanza difese: ");
    imp_difese = input.nextDouble();

    System.out.println("Importanza distanza: ");
    imp_distanza = input.nextDouble();


    for(int i = 0; i < 20; i++){ //Numero umani
      umani.add(new Umano(0, 0, 0));
    }
    umani.get(0).setSalute(1);

    Init i = new Init();
    i.initializer(umani, m.getMaxX(),  m.getMaxY());
    
    Page P = new Page(umani);
    
    JFrame f = new JFrame();
  	f.setSize(500, 300);
  	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	SampleComponent panel = new SampleComponent(umani);
  	f.add(panel);
  	f.setVisible(true);
    
    for (int j = 0; j < 100; j++){
    	//Numero di iterazioni simulazione
    	System.out.println("Iterazione: "+j);
    	T.muovi();
    	c.controlloContagio(umani);
    	panel.repaint();
    	P.disegna();
    	
    	float infetti = 0;
		float sani = 0;
		for (Umano u: umani) {
			if(u.getSalute() == 1) {
				infetti++; 
			}
			else {
				sani++;
			}
		}
		
		System.out.println("Infetti: "+ infetti+"\nSani: "+sani);
		
		Thread.sleep(500);
    }



  }//METODO MAIN

}//CLASSE MAIN
