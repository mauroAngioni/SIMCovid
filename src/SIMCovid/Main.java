package SIMCovid;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Umano> u = new ArrayList<Umano>();
		Umano m = new Umano(1);
		for (int i=0; i<5 ; i++) {
			u.add(0, m);
		}
		m.setSalute(0);
		for (int i=5; i<10 ; i++) {
			u.add(0, m);
		}
		Page p = new Page(u);
		m.setSalute(1);
		for (int i=0; i<10 ; i++) {
			u.add(0, m);
		}
		p.disegna();
		
	}

}
