package poo1;


public class PruebaString {
	public static void main(String[] args) {
		System.out.println("3");
		String msg = "Hola mundo";
		System.out.println(msg);
		int cant = msg.length();
		String[] r = msg.split("u");
		System.out.println(cant);
		System.out.println(msg.toUpperCase());
		System.out.println(msg.charAt(8));
		System.out.println(msg.substring(2,4));
		System.out.println(r[0]);
		System.out.println(r[1]);
		
	}
}
