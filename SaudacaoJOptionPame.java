
import javax.swing.JOptionPane;

public class SaudacaoJOptionPame {

	public static void main(String[] args) {
		String nome, sNome, aux, genero = null;
		int idade, aposentar;
		
		//Entrada com perguntas
		nome = JOptionPane.showInputDialog("Qual o seu primeiro nome? ");
		sNome = JOptionPane.showInputDialog("Qual o seu segundo nome? ");
		
		//Perguntar da idade
		genero = JOptionPane.showInputDialog("Qual é seu gênero? ");
		genero=genero.toUpperCase();
		aux = JOptionPane.showInputDialog("Qual a sua idade? ");
		//Conversão para int
		idade = Integer.parseInt(aux); //=16		
		
		if (idade >= 65) {
			JOptionPane.showMessageDialog(null, nome + " " + sNome + " " + "sua idade é: " + idade + " anos" + " Já pode descansar ");
		}else if (idade >= 16) {
			//Resposta saída
			JOptionPane.showMessageDialog(null, nome + " " + sNome + " " + "sua idade é: " + idade + " anos" + " Já pode trabalhar ");
		} else {
			JOptionPane.showMessageDialog(null, nome + " " + sNome + " " + "sua idade é: " + idade + " anos" + " Vai estudar!!!");
		}
		
		if (genero.equals("F") || genero.equals("f") || genero.equals("feminino")
				|| genero.equals("Feminino") || genero.equals("FEMININO")) {
			if(idade<60) {
				aposentar = 60 - idade;
				JOptionPane.showMessageDialog(null, "Faltam " + aposentar + " anos para aposentar");
			}else {
				 JOptionPane.showMessageDialog(null, "Você já está aposentada");
			}
		} else if (genero.equals("M") || genero.equals("m") || genero.equals("masculino")
				|| genero.equals("Masculino") || genero.equals("MASCULINO")) {
			if (idade < 66) {
				aposentar = 66 - idade;
				JOptionPane.showMessageDialog(null, "Faltam " + aposentar + " anos para aposentar");
			} else {
				JOptionPane.showMessageDialog(null, "Você já está aposentado");
			}
		}
		
		
		
	}

}
