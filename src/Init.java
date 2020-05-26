import java.util.LinkedList;

public class Init {
    
    public void initializer(LinkedList<Umano> Humans, int dimX, int dimY) {
        int x, y;

        for (int i = 0; i < Humans.size(); i++) {

            x = (int) (Math.random()*dimX);
            y = (int) (Math.random()*dimY);

            for (int j = 0; j < Humans.size(); j++) { 
                if (Humans.get(j).getX() != x && Humans.get(j).getY() != y) {
                    Humans.get(i).setX(x);
                    Humans.get(i).setY(y);
                }
            }

        }
    }

}