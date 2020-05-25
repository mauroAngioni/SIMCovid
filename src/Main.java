import java.util.Scanner;
import java.util.LinkedList;

class Main {

public int coeffdiffusione;
public int infettività;
public int resistenzaAlVirus;
public int durataVirus;

static Test ts = new Test();


public static void main(String[] args){
  ts.InputParametri();
  
}//METODO MAIN

public void InputParametri(){
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
}//METODO INPUT PARAMETRI

}//CLASSE MAIN