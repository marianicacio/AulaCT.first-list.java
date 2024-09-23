import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Aniversario {
    public static void main(String[] args) {
		String nome, mes, ano, dia;
		int iMes, iAno, iDia;
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		dia = JOptionPane.showInputDialog("Digite o dia que você nasceu: ");
		iDia = Integer.parseInt(dia);
		mes = JOptionPane.showInputDialog("Digite o mês que você nasceu: ");
		iMes = Integer.parseInt(mes);
		ano = JOptionPane.showInputDialog("Digite o ano que você nasceu: ");
		iAno = Integer.parseInt(ano);
		LocalDate data = LocalDate.now();
		
		int mesAtual = data.getMonthValue();
		
		if (mesAtual == iMes) {
			JOptionPane.showMessageDialog(null, "Feliz aniversário " + nome);
		} else {
			JOptionPane.showMessageDialog(null, "Não é o mês do seu aniversário " + nome);
		}
		
		JOptionPane.showMessageDialog(null, "Sua data de nascimento é " + dia + "/" + mes + "/" + ano);

		
	}
}
