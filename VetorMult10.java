import java.util.Scanner;

public class VetorMult10 {
    public static void main(String[] args) {
		int[] vet10 = new int[5];
		int i, mult;
		mult=10;
		
		//Entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 valores");
		for(i=0; i<5; i++) {
			vet10[i]=sc.nextInt();
			vet10[i] *= mult; 
		}
		
		//Saída
		for(i=0; i<5; i++) {
			System.out.println("Vet10[" + i + "]=" + vet10[i]);
		}
		sc.close();
		
	}
}
