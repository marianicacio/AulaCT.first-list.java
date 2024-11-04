public class CPF_Vetor {

	public static void main(String[] args) {
		int[] digitos = new int[11];
		int i, soma, peso;
		long cpf = 50107597802L;

		for (i = 10; i >= 0; i--) {
			digitos[i] = (int) (cpf % 10);
			cpf /= 10;
		}

		for (i = 0; i < 11; i++) {
			System.out.print(digitos[i] + " ");
		}

		// calcular o primeiro digito
		soma = 0;
		peso = 10;
		for (i = 0; i < 9; i++) {
			soma += digitos[i] * peso;
			peso--;
		}

		int digito1 = 11 - (soma % 11);
		if (digito1 >= 10) {
			digito1 = 0;
		} else {
			digito1 = digito1;
		}

		// calcular o segundo digito
		soma = 0;
		peso = 11;
		for (i = 0; i < 10; i++) {
			soma += digitos[i] * peso;
			peso--;
		}

		int digito2 = 11 - (soma % 11);
		if (digito2 >= 10) {
			digito2 = 0;
		} else {
			digito2 = digito2;
		}

		System.out.println("Valor Digitos: " + digito1 + digito2);

		if (digito1 == digitos[9] && digito2 == digitos[10]) {
			System.out.println("CPF válido");
		} else {
			System.out.println("CPF inválido");
		}
	}

}
