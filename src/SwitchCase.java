
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Ter�a-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "Valor invalido";

		}
		System.out.println("Dia da semana: " + dia);

		sc.close();

	}
}
