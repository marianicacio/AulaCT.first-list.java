import javax.swing.JOptionPane;

public class SwithCase {
    String opc, n1, n2;
		int iOpc;
		double dN1, dN2;
		
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

	}

}
