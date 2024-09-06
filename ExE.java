import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {
		//Entrada
		double v, tx, t, res;
		int num1 = 100;
		
		Scanner sc = new Scanner(System.in);
		
		//Processamento
		System.out.print("Digite o valor da prestação: ");
		v = sc.nextDouble();
		System.out.print("Digite o taxa da prestação: ");
		tx = sc.nextDouble();
		System.out.print("Digite o tempo em mêses de atraso: ");
		t = sc.nextDouble();
		
		res = v + (v * tx / num1) * t;
		
		//Saída
		System.out.println("O valor final com juros é: " +res);
	}
}
