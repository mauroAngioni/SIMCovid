public class Umano {
    private int x;
    private int y;
    private int salute; // 0 in salute 1 malato
    private double difese;
    private int età;

    public Umano(int x,int y,int salute) {
        this.x = x;
        this.y = y;
        this.salute = salute;
    }
    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
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
}
