import java.util.Scanner;
import java.util.LinkedList;

class Main {

  static public int coeffdiffusione;
  static public int range;
  static public int resistenzaAlVirus;
  static public int durataVirus;
  static public double infettività;  
  static public double imp_difese;
  static public double imp_distanza;

  Main m = new Main();
  m.controlloContagio();
  m.muovi();
  m.refresh();

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Coefficiente di diffusione: ");
    coeffdiffusione = input.nextInt();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Range: ");
    range = input2.nextInt();

    Scanner input3 = new Scanner(System.in);
    System.out.println("Resistenza al virus: ");
    resistenzaAlVirus = input3.nextInt();

    Scanner input4 = new Scanner(System.in);
    System.out.println("Durata virus: ");
    durataVirus = input4.nextInt();

    Scanner input5 = new Scanner(System.in);
    System.out.println("Infettività: ");
    infettività = input5.nextInt();

    Scanner input6 = new Scanner(System.in);
    System.out.println("Importanza difese: ");
    imp_difese = input5.nextInt();

    Scanner input7 = new Scanner(System.in);
    System.out.println("Importanza distanza: ");
    imp_distanza = input5.nextInt();
 

  }//METODO MAIN

}//CLASSE MAIN

