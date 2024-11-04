import java.util.Scanner;

public class QuadradoVetor {
    public static void main(String[] args) {
		int[] vetor = new int[5];
		int[] vetQ = new int[5];
		int i;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);

		for(i=0; i<5; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
			//processamento 
			vetQ[i] = (int)Math.pow(vetor[i], 2);
		}
		System.out.println("");
		
		//Printar saída de vetQ[]
		for(i=0; i<5; i++) {
			System.out.println("Quadrado:[" + i + "]=" + vetQ[i]);
		}
		sc.close();
	}
}
