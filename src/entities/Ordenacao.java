package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ordenacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();

		int menor = 0, maior = 0, aux = 0;

		for (int i = 0; i < 10; i++) {
			int numero = sc.nextInt();
			lista.add(numero);
		}

		maior = lista.get(0);

		for (Integer numero : lista) {
			if (numero > maior) {
				maior = numero;
			}
		}
		
		Collections.sort(lista);
		for (Integer e : lista) {
			System.out.print(e + " ");
		}
		System.out.println("\nMaior: " + maior);
	}

}
