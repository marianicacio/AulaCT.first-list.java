import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
		int num1, num2, num3, num4, res;
		num2 = 32;
		num3 = 5;
		num4 = 9;
		Scanner sc = new Scanner(System.in);
		
		//Processamento
		System.out.print("Digite os graus Fahrenheit: ");
		num1 = sc.nextInt();
		
		res = ((num1 - num2) * num3) / num4;
		
		//Saída
		System.out.println("O resultado em Celsius é: " +res);
	}
}
