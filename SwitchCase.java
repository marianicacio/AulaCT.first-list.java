
import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		String opc, n1, n2, n3;
		int iOpc;
		double dN1, dN2, dN3, res;
		
		opc = JOptionPane.showInputDialog("1 - Maior número\n" + "2- Par ou ímpar\n" + "3- Positivo ou Negativo\n" + "4- Divisível por 5\n" + "5- Soma de 3 números (+/-?0)\\n" + "Digite a opção: " );
		iOpc = Integer.parseInt(opc);
		
		switch (iOpc) {
		case 1: 
			n1=JOptionPane.showInputDialog("Digite primeiro número: ");
			dN1=Double.parseDouble(n1);
			n2=JOptionPane.showInputDialog("Digite o segundo número: ");
			dN2=Double.parseDouble(n2);
			if(dN1 > dN2) {
				JOptionPane.showMessageDialog(null, dN1+" é maior que " + dN2);
			} else if (dN1 < dN2) {
				JOptionPane.showMessageDialog(null, dN2+" é maior que " + dN1);
			} else {
				JOptionPane.showMessageDialog(null, dN1+ "e" + dN1 + " são iguais");
			}
			break;
		default: 
			JOptionPane.showMessageDialog(null, "Opçãp inválida");
			break;
		case 2: 
			n1=JOptionPane.showInputDialog("Digite um número: ");
			dN1=Double.parseDouble(n1);
			if ( dN1%2 == 0) {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é par ");
			} else {
				JOptionPane.showMessageDialog(null, dN1+ " esse número é impar " );
			}
			break;
		case 3: 
			n1=JOptionPane.showInputDialog("Digite um número: ");
			dN1=Double.parseDouble(n1);
			if (dN1<0) {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é negativo ");
			} else if (dN1>0) {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é positivo ");
			} else {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é igual a 0 ");
			}
			break;
		case 4:
			n1=JOptionPane.showInputDialog("Digite um número: ");
			dN1=Double.parseDouble(n1);
			if (dN1%5 == 0) {
				JOptionPane.showMessageDialog(null, dN1 + " esse número é divisível por 5 ");
			} else {
				JOptionPane.showMessageDialog(null, dN1 + " esse número não é divisível por 5 ");
			}
			res = dN1 / 5;
			JOptionPane.showMessageDialog(null, res + " esse é o resultado ");
			break;
		case 5:
			n1=JOptionPane.showInputDialog("Digite o primeiro número: ");
			dN1=Double.parseDouble(n1);
			n2=JOptionPane.showInputDialog("Digite o segundo número: ");
			dN2=Double.parseDouble(n2);
			n3=JOptionPane.showInputDialog("Digite o terceiro número: ");
			dN3=Double.parseDouble(n3);
			res = dN1 + dN2 + dN3;
			JOptionPane.showMessageDialog(null, res + " essa é a soma dos 3 números");
			break;
	}

}
	
}
