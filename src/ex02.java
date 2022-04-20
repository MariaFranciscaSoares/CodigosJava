import java.util.Scanner;
import java.util.Locale;

public class ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		int  x;
		String S1, S2, S3;
		
		x = sc.nextInt();
		sc.nextLine();
		S1 = sc.nextLine();
		S2 = sc.nextLine();
		S3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);

		sc.close();
	}

}
