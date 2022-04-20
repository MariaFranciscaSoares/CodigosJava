import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();

		double desconto;

		desconto = preco < 20.0 ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);

		sc.close();

	}

}
