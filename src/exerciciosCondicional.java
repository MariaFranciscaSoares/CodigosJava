import java.util.Locale;
import java.util.Scanner;

public class exerciciosCondicional {

	public static void main(String[] args) {
		
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, imposto= 0;

		salario = sc.nextDouble();

		if (salario<=2000.00) {
			System.out.println("Isento");
		} 
		else if (salario<=3000.00) {
			imposto = (salario-2000.00)*0.8;
		} 
		else if (salario<=4500.00) {
			imposto = (salario-3000.00)*0.18+ 1000*0.08;
		}
		else{
	    	imposto = (salario-4500.00)*0.28+ 1500*0.18+ 1000*0.08;
		}
		
	   
	    
	    System.out.printf("R$ %.2f", imposto);
		
		sc.close();
	}

}
