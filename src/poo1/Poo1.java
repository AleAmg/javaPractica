package poo1;
import java.util.*;
public class Poo1 {

	public static void contador() {
		Scanner num = new Scanner(System.in);
		int ent = num.nextInt();
		for(int i=0; i<ent; i++) {
			System.out.println(i);
		}
	}
	public static void suma() {
		Scanner num = new Scanner(System.in);
		int ent = num.nextInt();
		int n=0;
		for(int i=0; i<ent; i++) {
			if(i%3==0||i%5==0) {
				n+=i;
			}
		}
		System.out.println(n);
	}
	public static void promedio() {
		Scanner num = new Scanner(System.in);
		int ent = num.nextInt();
		int i=0, c=0;
		while(ent!=0) {
			i+=ent;
			c++;
			Scanner n = new Scanner(System.in);
			ent = n.nextInt();
		}
		System.out.println(i/c);
	}
	public static boolean primo() {
		Scanner num = new Scanner(System.in);
		int ent = num.nextInt();
		System.out.println(ent%2!=0&&ent%3!=0&&ent%5!=0&&ent%7!=0);
		return ent%2!=0&&ent%3!=0&&ent%5!=0&&ent%7!=0;
	}
	
	public static void main(String[] args) {
		//contador();
		//suma();
		//promedio();
		//primo();
		
	}

}
