package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class TerceiroExercicioProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		System.out.println("Name: ");
		st.name = sc.nextLine();
		System.out.println("Nota do Primeiro Trimestre: ");
		st.primeiraNota = sc.nextDouble();
		System.out.println("Nota do Segundo Trimestre: ");
		st.segundaNota = sc.nextDouble();
		System.out.println("Nota do Terceiro Trimestre: ");
		st.terceiraNota = sc.nextDouble();
		System.out.printf("Final da grade %.2f\n", st.endNote());

		if (st.endNote() > 60)
			System.out.println("PASS ");

		else
			System.out.printf("FAILED\n" + "MISSING %.2f", st.approval());

		sc.close();

	}

}
