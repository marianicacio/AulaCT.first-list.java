import java.util.Scanner;

public class ExA {

	public static void main(String[] args) {
		//Entrada
		int num1, num2, num3, num4, res;
		num2 = 9;
		num3 = 5;
		num4 = 32;
		Scanner sc = new Scanner(System.in);
		
		//Processamento
		System.out.print("Digite os graus Celsius: ");
		num1 = sc.nextInt();
		
		res = num1 * num2 / num3 + num4;
		
		//Saída
		System.out.println("O resultado em Fahrenheit é: " +res);
	}
}
