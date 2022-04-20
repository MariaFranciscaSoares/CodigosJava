import java.util.Locale;
import java.util.Scanner;

public class EstrturaDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resposta;

		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = (9 * C) / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.2f\n", F);
			System.out.println("Deseja repetir? Digite 'S' para SIM ou 'N' para Não");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');

		sc.close();

	}

}
