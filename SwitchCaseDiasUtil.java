import javax.swing.JOptionPane;

public class SwitchCaseDiasUtil {

	public static void main(String[] args) {
		String diaSemana;
		int iDiaSemana;
		
		diaSemana = JOptionPane.showInputDialog("Qual o dia da semana que você quer: "
				+ " 1 - Domingo\n"
				+ " 2 - Segunda-Feira\n" 
				+ " 3 - Terça-Feira\n"
				+ " 4 - Quarta-Feira\n"
				+ " 5 - Quinta-Feira\n"
				+ " 6 - Sexta-Feira\n"
				+ " 7 - Sábado\n");
		
		iDiaSemana = Integer.parseInt(diaSemana);
		
		switch (iDiaSemana) {
		case 1 :
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Domingo: " + iDiaSemana);
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Segunda-Feira: " + iDiaSemana);
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Terça-Feira: " + iDiaSemana);
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Quarta-Feira: " + iDiaSemana);
		break;
		case 5:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Quinta-Feira: " + iDiaSemana);
		break;
		case 6:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Sexta-Feira: " + iDiaSemana);
		break;
		case 7:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é Sábado: " + iDiaSemana);
		break;
		default:
			JOptionPane.showMessageDialog(null, "O dia da semana informado é inválido: ");
		break;
		}
		}

}

