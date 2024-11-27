import java.util.Scanner;

public class QuartaExE {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		
		int[] mA = new int[15];
		int[] mB = new int[15];
		
		for(int i=0; i<15;) {
			try {
				System.out.println("Digite um valor: ");
				mA[i] = sc.nextInt();
				
				fatorial = 1;
				
				for(int l = 1; l <= mA[i]; l++) {
					fatorial = fatorial * l;
				}
				
				mB[i] = fatorial;
				
				i++;
				
			}catch (Exception e) {
				System.out.println("Digite um valor valido por favor!");
				sc.next();
			}
		}
			
			sc.close();
			
			  for(int i1 = -1; i1 < 15; i1++){
		            if(i1 == -1) {
		                System.out.println("Matriz B: ");
		            } else {
		                System.out.println(i1 + ": " + mB[i1]);
		            }}
		        }
}
