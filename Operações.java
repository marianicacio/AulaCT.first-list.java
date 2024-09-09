

import java.util.Scanner;

public class Operações {

	public static void main(String[] args) {
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		//Declaração
		double a, b;
		
		//Operadores de atribuição: *=, -=, +=, /=, %=
		System.out.println("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.println("Digite outro valor decimal: ");
		b = sc.nextDouble();
		a+=b;
		System.out.printf("A soma é : %.2f\n\n", a);
		
		System.out.println("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.println("Digite outro valor decimal: ");
		b = sc.nextDouble();
		a*=b;
		System.out.println("O produto é: " + a);
		
		System.out.println("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.println("Digite outro valor decimal: ");
		b = sc.nextDouble();
		a-=b;
		System.out.printf("A diferença é: %.2f\n\n", a);
		
		System.out.println("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.println("Digite outro valor decimal: ");
		b = sc.nextDouble();
		a/=b;
		System.out.printf("A Divisão é: %.2f\\n\\n", a);
		
		System.out.println("Digite um valor decimal: ");
		a = sc.nextDouble();
		System.out.println("Digite outro valor decimal: ");
		b = sc.nextDouble();
		a%=b;
		System.out.printf("O resto da divisão é: %.2f\\\\n\\\\n", a);
	}

}
