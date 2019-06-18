import javax.swing.JOptionPane;
public class Principal {
	static final String opcoes[] = {
			"-- Selecione sua opcao --",
			"Moradores", 
			"Despesa", 
			"Calculo", 
			"Sair"
		};
	public static void main(String [] args) {
		Object opcao = JOptionPane.showInputDialog(
			null, 
			"Escolha", 
			"Usuario", 
			JOptionPane.QUESTION_MESSAGE, 
			null, 
			opcoes, 
			opcoes[0]);
			do {
				switch (opcao.toString()) {
				
				case "Moradores":
					Usuario u = new Usuario();
					u.novoUsuario();
				break;
				
				case "Despesa":
					Despesa d = new Despesa();
					d.cadastrarDespesa();
				break;

				case "Calculo":
					Calculo c = new Calculo();
					c.fazendoCalculo();
					break;
				default:
				break;
				}

					opcao = JOptionPane.showInputDialog(
							null, 
							"Menu Principal", 
							"Opções", 
							JOptionPane.QUESTION_MESSAGE, 
							null, 
							opcoes, 
							opcoes[0]);
			} while (!opcao.toString().equalsIgnoreCase(opcoes[4]));
	}	
}
