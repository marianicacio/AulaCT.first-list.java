import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
		//Entrada
		double num1, num2, num4, res;
		num1 = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		//Processamento
		System.out.print("Digite a altura em cm: ");
		num4 = sc.nextDouble();
		System.out.print("Digite o raio em cm: ");
		num2 = sc.nextDouble();
		
		res = num1 * (num2 * num2) * num4;
		
		//Saída
		System.out.println("O volume é: " +res);
	}
}
