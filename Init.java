package class_x_school;

public class Init {
    
    public void initializer(int numHumans, Umani Humans, int dimX, int dimY) {
        int x, y;

        for (int i = 0; i < numHumans; i++) {

            x = (int) (Math.random()*dimX);
            y = (int) (Math.random()*dimY;

            for (int j = 0; j < numHumans; j++) { 
                if (Humans.humanAt(j).getX() != x && Humans.humanAt(j).getY() != y) {
                    Humans.humanAt(i).setX(x);
                    Humans.humanAt(i).setY(y);
                }
            }

        }
    }

}