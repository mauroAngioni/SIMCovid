public class Umano {
    private Umano link;
    private int infettabilità;
    private int x;
    private int y;
    private boolean malato;

    public Umano(String informazioni) {
        setInfo(informazioni);
    }
//set/get
    public Umano getLink() {
        return link;
    }

    public void setLink(Umano link) {
        this.link = link;
    }

    public int getInfettabilità() {
        return infettabilità;
    }

    public void setInfettabilità(int inf) {
        infettabilità = inf;
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
    public bool getMalato() {
        return malato;
    }

    public void setMalato(bool malato) {
        this.malato = malato;
    }
//Metodi vari
}