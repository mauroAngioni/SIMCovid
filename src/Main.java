import java.util.Scanner;
import java.util.LinkedList;
import javax.swing.JFrame;

class Main {


  static public int range;
  static public double infettività;  
  static public double imp_difese;
  static public double imp_distanza;



  public static void main(String[] args){
    
  Umano U = new Umano(0, 0, 0); 
  GestioneUmani umani = new GestioneUmani();
  Contagio c = new Contagio();

 TestMovimento T = new TestMovimento(umani);
 
  Page P = new Page(umani); 


   JFrame f = new JFrame();
   f.setSize(500, 300);
   f.getContentPane().add(newSampleComponent());
   f.setVisible(true);

   
    Scanner input = new Scanner(System.in);
    System.out.println("Range: ");
    range = input.nextInt();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Infettività: ");
    infettività = input2.nextInt();

    Scanner input3 = new Scanner(System.in);
    System.out.println("Importanza difese: ");
    imp_difese = input3.nextInt();

    Scanner input4 = new Scanner(System.in);
    System.out.println("Importanza distanza: ");
    imp_distanza = input4.nextInt();
 

    for(int i = 0; i < 20; i++){ //Numero umani
      umani.push(new Umano(0, 0, 0));
    }
    
    Mondo m = new Mondo();
    Init i = new Init();
    i.initializer(umani, m.getMaxX(),  m.getMaxY());

    for (int j = 0; j < 1000; j++){ 
      //Numero di iterazioni simulazione
      T.muovi();
      c.controlloContagio(umani);
      f.repaint();
      P.disegna();
    }
    
    

  }//METODO MAIN

}//CLASSE MAIN

