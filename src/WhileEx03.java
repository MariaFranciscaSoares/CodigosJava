import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;

		while (x != 4) {
			if (x == 1) {
				alcool += 1;
			}
			if (x == 2) {
				gasolina += 1;
			}
			if (x == 3) {
				diesel += 1;
			}
			x = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();

	}

}
