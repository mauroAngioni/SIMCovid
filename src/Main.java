import java.util.Scanner;


import javax.swing.JFrame;
import java.util.LinkedList;

class Main {

  static public int coeffdiffusione;
  static public int infettività;
  static public int resistenzaAlVirus;
  static public int durataVirus;


  public static void main(String[] args){
	  
    Scanner input = new Scanner(System.in);
    System.out.println("Coefficiente di diffusione: ");
    coeffdiffusione = input.nextInt();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Infettività: ");
    infettività = input2.nextInt();

    Scanner input3 = new Scanner(System.in);
    System.out.println("Resistenza al virus: ");
    resistenzaAlVirus = input3.nextInt();

    Scanner input4 = new Scanner(System.in);
    System.out.println("Durata virus: ");
    durataVirus = input4.nextInt();
    
    JFrame f = new JFrame();
    f.setSize(500, 300);
    f.getContentPane().add(new SampleComponent());
    f.setVisible(true);
    
  }//METODO MAIN

}//CLASSE MAIN