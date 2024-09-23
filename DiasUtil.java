import javax.swing.JOptionPane;

public class DiasUtil {

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
	
	if(iDiaSemana == 1 || iDiaSemana == 7) {
		JOptionPane.showMessageDialog(null, "O dia da semana informado é fds: " + iDiaSemana);
	} else if (iDiaSemana >= 2 && iDiaSemana <=6) {
		JOptionPane.showMessageDialog(null, "O dia da semana informado é útil " + iDiaSemana);
	} else {
		JOptionPane.showMessageDialog(null, "O dia da semana inválido " + iDiaSemana);
	}
	}

}