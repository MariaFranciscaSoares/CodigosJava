import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner numeros = new Scanner(System.in);

		System.out.println("Digite três numeros: ");
		int primeiroNumero = numeros.nextInt();
		int segundoNumero = numeros.nextInt();
		int terceiroNumero = numeros.nextInt();

		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println(primeiroNumero);
		} else if (segundoNumero > terceiroNumero) {
			System.out.println(segundoNumero);
		} else {
			System.out.println(terceiroNumero);
		}
		numeros.close();

	}
}
