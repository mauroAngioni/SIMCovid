import java.util.LinkedList;
import java.util.Random;

public class TestMovimento {
	
    private LinkedList<Umano> umani;
    
    private Random r = new Random();
    private Mondo m = new Mondo();
    
    public TestMovimento(LinkedList<Umano> umani) {
    	this.umani = umani;
    }
    
    public void muovi() {
        for(int i = 0; i < this.umani.size(); i++) {
            int passiX = r.nextInt(3) + 1;
            int passiY = r.nextInt(3) + 1;
            
            if(umani.get(i).getX() + passiX > m.getMaxX()) {
                umani.get(i).setX(m.getMaxX() - umani.get(i).getX() + passiX);
            }
            
            if(umani.get(i).getY() + passiY > m.getMaxY()) {
                umani.get(i).setY(m.getMaxY() - umani.get(i).getY() + passiY);
            }
            
            if(umani.get(i).getX() + passiX <= m.getMaxX()) {
                umani.get(i).setX(umani.get(i).getX() + passiX);
            }
            
            if(umani.get(i).getY() + passiY <= m.getMaxY()) {
                umani.get(i).setY(umani.get(i).getY() + passiY);
            }                
        }
    }
}



