import java.util.Random;

public class TestMovimento {
	
    private GestioneUmani umani;
    
    private Random r = new Random();
    private Mondo m;
    
    public TestMovimento(GestioneUmani umani, Mondo m) {
    	this.umani = umani;
    	this.m = m;
    }
    
    public void muovi() {
        for(Umano u: umani) {
            int passiX = r.nextInt(3) - 1;
            int passiY = r.nextInt(3) - 1;
            
            if(u.getX() + passiX > m.getMaxX()) {
                u.setX(m.getMaxX() - u.getX() + passiX);
            }
            
            if(u.getY() + passiY > m.getMaxY()) {
                u.setY(m.getMaxY() - u.getY() + passiY);
            }
            
            if(u.getX() + passiX <= m.getMaxX()) {
                u.setX(u.getX() + passiX);
            }
            
            if(u.getY() + passiY <= m.getMaxY()) {
                u.setY(u.getY() + passiY);
            }                
        }
    }
}



