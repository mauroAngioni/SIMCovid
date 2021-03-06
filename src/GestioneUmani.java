import java.util.LinkedList;

public class GestioneUmani extends LinkedList<Umano>{
  
  public LinkedList<Umano> Ricerca(Umano u, int range){
    Umano app = new Umano(0,0,0);
    Umano last = getLast();
    LinkedList<Umano> ListaVicini = new LinkedList<Umano>();
    int i = 0;
    int cont = 0;
    double dist = 0;  
    while (app != last){
      app = get(i);
      dist = Distanza(u, app);
      if (dist <= range && app.getSalute() == 1){
        ListaVicini.add(app);
      }
      i++;
    }
  return ListaVicini;
  }

  
  
  //Altri metodi
  public double Distanza(Umano u, Umano u2){
     int Ux = u.getX();
     int U2x = u2.getX();
     int Uy = u.getY();
     int U2y = u.getY();
     int xTot = Ux - U2x;
     int yTot = Uy - U2y;
     int xTotp = xTot*xTot;
     int yTotp = yTot*yTot;
     int Tot = xTotp + yTotp;
     double distanza = Math.sqrt(Tot); 
     return distanza;
  }
}
