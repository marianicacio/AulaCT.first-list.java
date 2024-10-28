import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		//manual
		
		int[]numeros = new int [5];
		int i;
		numeros[0] = 4;
		numeros[1] = 11;
		numeros[2] = 3;
		numeros[3] = 10;
		numeros[4] = 28;
		
		System.out.println(numeros[0]);
		
		//printar automatico
		for(i=0; i<5;  i++) {
			System.out.println(numeros[i]);
		}
		
		//entrada automatica
		for(i=0; i<5; i++) {
			numeros[i]=1000+i;
		}
		
		for(i=0; i<5;  i++) {
			System.out.println(numeros[i]);
		}
		
		//entrada com o usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 valores: ");
		for(i=0; i<5; i++) {
			numeros[i]=sc.nextInt();
		}
		
		for(i=0; i<5; i++) {
			System.out.println(numeros[i]);
		}
	}

}
