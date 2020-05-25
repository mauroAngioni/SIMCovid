public class Umani {
	private int x;
	private int y;
	private boolean malato;
	
	Mondo m = new Mondo();
	

	public Umani(){
		this.x=(int) (Math.random() * m.getMaxX());
		this.y=(int)(Math.random()* m.getMaxY());
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX () {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean getMalato() {
		return malato;
	}

	public void setMalato(boolean malato) {
		this.malato=malato;
	}
}