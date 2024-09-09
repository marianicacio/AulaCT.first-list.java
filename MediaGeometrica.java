

import java.util.Scanner;

public class MediaGeometrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaração de variavel
		double a,b,c,r, mg;
		
		//Dar entrada nos dados 
		System.out.println("Digite o primeiro número:");
		a = sc.nextDouble();
		System.out.println("Digite o segundo número:");
		b = sc.nextDouble();
		System.out.println("Digite o terceiro número:");
		c = sc.nextDouble();
		
		//cálculo de processamento
		r = (a+b+c)/3.0;
		
		mg = Math.pow(a*b*c,1.0/3.0);
		
		//Saída
		System.out.printf("A média é: %.2f ", + r);
		System.out.printf("A média geométrica é: %.2f", + mg);
		
		sc.close();

	}

}

