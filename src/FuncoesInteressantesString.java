import java.util.Scanner;

public class FuncoesInteressantesString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String original = "abcde FGHIJ ABC abc DEFG ";
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 9);
		String s6 = original.replace('a', 'x');
		String s7 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("String Original:" + "-" + original + "-");
		System.out.println("String  toLowerCase();" + "-" + s1 + "-");
		System.out.println("String  toUpperCase();" + "-" + s2 + "-");
		System.out.println("String  trim();" + "-" + s3 + "-");
		System.out.println("String substring (2)" + "-" + s4 + "-");
		System.out.println("String substring (2,9)" + "-" + s5 + "-");
		System.out.println("String replace ('a','x')" + "-" + s6 + "-");
		System.out.println("String replace ('abc','xy')" + "-" + s7 + "-");
		System.out.println("String indexOf ('bc')" + i);
		System.out.println("String indexOf ('bc')" + j);
		
		
		String nome = "Maria Francisca Soares Miranda";
		String[] vect = nome.split(" ");
		
		System.out.println("\n\nFUNÇÃO SPLIT\n*" + vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		sc.close();
	}

}
