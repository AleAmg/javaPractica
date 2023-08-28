package poo1;

public class nose {
	public static String invertido (String str) {
		//String str="a      a";
		String rts="";
		for(int i=str.length()-1;i>=0;i--) {
			rts+=str.charAt(i);
		}
		return rts;
	}
	public static Boolean palin (String str) {
		String inv=invertido(str);
		return inv.equals(str);
	}
	
	public static int sumaPar() {
		int []b= {1,2,13,4,8,6};
		int suma=0;
		for(int i=0;1<b.length-1;i+=2) {
				suma+=b[i];
		}
		return suma;
	}
	public static void main(String[] args) {
		//String str="ahmburguera";
		//System.out.println(invertido(str));
		//System.out.println(palin(str));
		//System.out.println(inOrder());
		System.out.println(sumaPar());
	}

}
