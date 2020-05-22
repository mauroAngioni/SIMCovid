public class Umano {
    private int x;
    private int y;
    private boolean malato;
    private double difese;
    private int età;

    public Umano(int x,int y,boolean malato) {
        this.x = x;
        this.y = y;
        this.malato = malato;
    }
//set/get
    public boolean getMalato() {
        return malato;
    }

    public void setMalato(boolean malato) {
        this.malato = malato;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double getDifese() {
        return difese;
    }

    public void setDifese(double difese) {
        this.difese = difese;
    }
    public void setEtà(int età) {
        this.età = età;
    }
    public int getEtà() {
        return età;
    }
//Metodi vari
}