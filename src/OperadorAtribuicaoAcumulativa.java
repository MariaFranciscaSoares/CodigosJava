import java.util.Locale;
import java.util.Scanner;

public class OperadorAtribuicaoAcumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double valor = 50.0;

		if (minutos > 100) {

			valor += (minutos - 100) * 2;
		}
        
		System.out.printf("Valor a ser pago R$: %.2f", valor);
		sc.close();
	}

}
