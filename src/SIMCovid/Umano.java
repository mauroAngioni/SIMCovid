package SIMCovid;
////////A PURO SCOPO DI TEST
///////NON GESTIAMO NOI LA CLASSE UMANO
public class Umano {

	int salute;// 0 sano 1 infetto
	
	public Umano(int salute) {
		this.salute = salute;
	}
	
	public int getSalute() {
		return salute;
	}
	
	public void setSalute(int salute) {
		this.salute = salute;
	}
}