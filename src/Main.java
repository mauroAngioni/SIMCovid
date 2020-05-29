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


  public static void main(String[] args){

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

    Init i = new Init();
    i.initializer(umani, m.getMaxX(),  m.getMaxY());
    
    Page P = new Page(umani);
    
    JFrame f = new JFrame();
  	f.setSize(500, 300);
  	f.getContentPane().add(new SampleComponent(umani));
  	f.setVisible(true);
    
    for (int j = 0; j < 1000; j++){
    	//Numero di iterazioni simulazione
    	System.out.println("Iterazione: "+j);
    	T.muovi();
    	c.controlloContagio(umani);
    	f.repaint();
    	P.disegna();
    	
    	float infetti = 0;
		float sani = 0;
		for (int k=0; k<umani.size(); k++) {
			if(umani.get(k).getSalute() == 1) {
				infetti++; 
			}
			else {
				sani++;
			}
		}
		
		System.out.println("Infetti: "+ infetti+"\nSani: "+sani);
    }



  }//METODO MAIN

}//CLASSE MAIN
