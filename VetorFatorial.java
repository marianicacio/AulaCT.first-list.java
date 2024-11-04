import java.util.Scanner;

public class VetorFatorial {
    public static void main(String[] args) {
		int[] vetorFat = new int[5];
		int[] vetFat = new int[5];
		int i, fat, j;
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite 5 valor: ");
		
		for(i=0; i<5; i++) {
			vetorFat[i]=sc.nextInt();
			}
		
		//Calcular Fatorial
		for(i=0; i<5; i++) {
			fat=1;
			for(j=1; j<=vetorFat[i]; j++) {
				fat*= j;	
		}
			vetFat[i]=fat;
			System.out.println("Fat[" + i + "]= " + vetFat[i]);
		}
		
		sc.close();

	}
}
