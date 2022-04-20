package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double areaX, areaY;

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		areaX = x.area();
		areaY = y.area();

		System.out.printf("AREA TRIANGULO X: %.4f\nAREA DO TRIANGULO Y %.4f\n", areaX, areaY);

		if (areaX > areaY)
			System.out.println("Triangulo X possui a maior area");
		else
			System.out.println("Triangulo Y possui a maior area");

		sc.close();

	}

}
