import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Umano> u = new LinkedList<Umano>();
		Page p = new Page(u);
		for (int i=0; i<6 ; i++) {
			Umano m = new Umano(0, 0, 0);
			u.add(m);
		}
		for (int i=6; i<10 ; i++) {
			Umano m = new Umano(0, 0, 1);
			u.add(m);
		}
		p.disegna();
		Thread.sleep(2000);
		for (int i=2; i<10 ; i++) {
			u.get(i).setSalute(1);
		}
		p.disegna();
		Thread.sleep(2000);
		for (int i=5; i<10 ; i++) {
			u.get(i).setSalute(0);
		}
		p.disegna();
		
	}

}
