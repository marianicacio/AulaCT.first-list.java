import java.util.Scanner;

public class VetorPar {
    public static void main(String[] args) {
		int[] vetor = new int[5];
		int i, j = 0;
		
		int vetPar[] = {0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<5; i++) {
			vetor[i]=sc.nextInt();
		}
		
		for(i=0; i<5; i++) {
			if(vetor[i]%2 == 0) {
				vetPar[j]=vetor[i];
				j++;
			}
		}
		
		for(i=0; i<5; i++) {
			if(j==0) {
				System.out.println("Não há valores pares");
			} else {
				System.out.println("vetor[" + i + "]= " + vetPar[i]);
			}
			
		}

	}
}
