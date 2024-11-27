import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartaExC {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] mA = new double[20];
		
		double[] mB = new double[20];
		
		double[] mC = new double[20];
		
		for(int i = 0; i <20;) {
			try {
				System.out.println("Matriz A - Digite um valor: ");
				mA[i] = sc.nextDouble();
				
				i++;
			}catch(InputMismatchException e) {
				System.out.println("Valor Invalido!");
				sc.next();
			}
		}
		
		for(int i = 0; i <20;) {
			try {
				System.out.println("Matriz A - Digite um valor: ");
				mB[i] = sc.nextDouble();
				
				i++;
			}catch(InputMismatchException e) {
				System.out.println("Valor Invalido!");
				sc.next();
			}
		}
		
		
		sc.close();
		
		for(int i = -1; i < 20; i++) {
			if (i == -1) {
				System.out.println("Matriz C: ");
			} else {
				mC[i] = mA[i] - mB[i];
				System.out.println(i + ": " + mC[i]);
			}
		}
	}
}
