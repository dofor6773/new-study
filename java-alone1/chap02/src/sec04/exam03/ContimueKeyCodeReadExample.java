package sec04.exam03;

public class ContimueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
		    keyCode = System.in.read();
		    System.out.println("KeyCode: " + keyCode);
		}
	}
}
