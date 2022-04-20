import java.util.Locale;
import java.util.Scanner;

public class ExercFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
       
		for (int i=1; i<=N; i++) {

			int x = i*i;
			int y = i*x;	
			System.out.print(i );
			System.out.print(" " + x);
			System.out.println(" " +y);
		}

		sc.close();

	}
}
