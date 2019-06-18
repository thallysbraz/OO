import javax.swing.JOptionPane;

public class Calculo {
	public void fazendoCalculo() {
		main(null);
		}
	static final String opcoes[] = {
			"-- Selecione sua opcao --",
			"Igualitario", 
			"Proporcional", 
			"Retornar ao Menu Principal"
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
					case "Igualitario":
						Igualitario i = new Igualitario();
					break;
					case "Proporcional":
						Proporcional p = new Proporcional();
					break;
	
					case "Retornar ao Menu Principal":
						//falta implementar
						break;
					default:
					break;
					}

					opcao = JOptionPane.showInputDialog(
							null, 
							"Menu Calculo", 
							"Opções", 
							JOptionPane.QUESTION_MESSAGE, 
							null, 
							opcoes, 
							opcoes[0]);
				} while (!opcao.toString().equalsIgnoreCase(opcoes[3]));
	}
}
