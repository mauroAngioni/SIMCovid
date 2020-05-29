import java.util.LinkedList;

public class Init {
    
    public void initializer(GestioneUmani Humans, int dimX, int dimY) {
        int x, y, difese;

        for (int i = 0; i < Humans.size(); i++) {

            x = (int) (Math.random()*dimX);
            y = (int) (Math.random()*dimY);
            difese = (int) (Math.random()*100);

            for (int j = 0; j < Humans.size(); j++) { 
                if (Humans.get(j).getX() != x && Humans.get(j).getY() != y) {
                    Humans.get(i).setX(x);
                    Humans.get(i).setY(y);
                    Humans.get(i).setDifese(difese);
                }
            }

        }
    }

}