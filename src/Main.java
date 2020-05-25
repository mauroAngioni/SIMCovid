public class Main {

	public static void main(String[] args) {
		
		TestMovimento ogg = new TestMovimento();
		
		ogg.popolaMondo();
		
		System.out.println("Coordinate Iniziali");
		ogg.stampaPosizioni();
		
		ogg.muovi();
		
		System.out.println("Coordinate Finali");
		ogg.stampaPosizioni();
 
	}

}
