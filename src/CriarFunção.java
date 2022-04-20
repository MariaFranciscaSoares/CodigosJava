import java.util.Scanner;

public class CriarFunção {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);

		showResult(maior);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int maior;
		if (x > y && x > z) {
			maior = x;
		} else if (y > z) {
			maior = y;
		} else {
			maior = z;
		}
		return maior;
	}
	public static void showResult(int start) {
		System.out.println("Maior numero: "+ start);
	}

}
