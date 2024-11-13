import java.util.Scanner;

public class CNPJ {
    public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int[] numeros = new int[14];
			int soma = 0, digito1, digito2, mult = 5;
			long cnpj = 11444777000161L;
			
			for(int i = 0; i< 14; i++) {
				numeros[i] = (int) (cnpj%10);
				cnpj = cnpj / 10;
			}
			
			for(int i = 13; i> 1; i--) {
				
				if(mult < 2)
					mult = 9;
				
				soma += numeros[i] * mult;
				mult--;
			}
			
			if (soma% 11 < 2) {
				digito1 = 0;
			}else {
				digito1 = 11 - (soma % 11);
			}
			
			soma = 0;
			
			mult = 6;
			
			for(int i = 13; i > 0; i--) {
				
				if(mult < 2)
					mult = 9;
				
				soma += numeros[i] * mult;
				mult--;
			}
			
			if(soma % 11 < 2) {
				digito2 = 0;
			} else {
				digito2 = 11 - (soma % 11);
			}
			
			if(numeros[0] == digito2 && numeros[1] == digito1) {
				System.out.println("Real");
			} else {
				System.out.println("Falso");
			}
            sc.close();
		
	}

}

}
