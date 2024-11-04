import java.util.Scanner;

public class OperacaoVetor {
    public static void main(String[] args) {
		int[] V1 = new int[5];
		int[] V2 = new int[5];
		int[] V3 = new int[5];
		int i;
		
		//Entrada fixa
		//int	V1[] = {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados
		for(i=0; i<5; i++) {
			System.out.println("V1[" + i + "] :" );
			V1[i]=sc.nextInt();
		}
			
		for(i=0; i<5; i++) {
			System.out.println("V2[" + i + "] :" );
			V2[i]=sc.nextInt();
		}
		
		//Processamento: Soma de vetores
		for(i=0; i<5; i++) {
			V3[i]=V2[i] + V1[1];
		}
		
		//Saída de dados
		for(i=0; i<5; i++) {
			System.out.println("Soma[" + i + "] =" + V3[i]);
		}
	}

}
