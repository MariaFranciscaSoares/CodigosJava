import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		TRIANGULO = A * C / 2;
		CIRCULO = 3.14159 * Math.pow(C, 2);
		TRAPEZIO = (A + B) * C / 2;
		QUADRADO = B * B;
		RETANGULO = A * B;

		System.out.printf(" TRIANGULO: %.3f%n CIRCULO: %.3f%n TRAPEZIO: %.3f%n QUADRADO: %.3f%n RETANGULO: %.3f%n", TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);
        
		sc.close();
	}

}
