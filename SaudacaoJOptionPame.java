

import javax.swing.JOptionPane;

public class SaudacaoJOptionPame {

	public static void main(String[] args) {
		String nome, sNome;
		
		//Entrada com perguntas
		nome = JOptionPane.showInputDialog("Qual o seu primeiro nome? ");
		sNome = JOptionPane.showInputDialog("Qual o seu segundo nome? ");
		
		//Resposta saída
		JOptionPane.showMessageDialog(null, nome + " " + sNome);
	}

}
