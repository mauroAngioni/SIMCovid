import java.util.Random;

public class TestMovimento {
    private int numeroUmani = 5;
    private Umani[] umani = new Umani[numeroUmani];
    
    private Random r = new Random();
    Mondo m = new Mondo();

    public void popolaMondo() {
        for(int i = 0; i < numeroUmani; i++) {
            umani[i] = new Umani();
        }
    }
    
    public void muovi() {
        for(int i = 0; i < numeroUmani; i++) {
            int passiX = r.nextInt(3) + 1;
            int passiY = r.nextInt(3) + 1;
            
            if(umani[i].getX() + passiX > m.getMaxX()) {
                umani[i].setX(m.getMaxX() - umani[i].getX() + passiX);
            }
            
            if(umani[i].getY() + passiY > m.getMaxY()) {
                umani[i].setY(m.getMaxY() - umani[i].getY() + passiY);
            }
            
            if(umani[i].getX() + passiX <= m.getMaxX()) {
                umani[i].setX(umani[i].getX() + passiX);
            }
            
            if(umani[i].getY() + passiY <= m.getMaxY()) {
                umani[i].setY(umani[i].getY() + passiY);
            }                
        }
    }
    
    public void stampaPosizioni() {
        for(int i = 0; i < numeroUmani; i++) {
            System.out.println(i + ". " + umani[i].getX() + " " + umani[i].getY());
        }
        System.out.println();
    }
}



