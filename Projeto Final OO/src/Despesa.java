import javax.swing.JOptionPane;

public class Despesa {
	void cadastrarDespesa() {
		main(null);
	}
	static final String opcoes[] = {
			"-- Selecione sua opcao --",
			"Telecomunicações", 
			"Residencia",
			"Outras Despesas",
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
					
			case "Telecomunicações":
				//Metodo pra escolher despesa Telecomunicaçoes
				//Cadastrar despesa Telecomunicações
				CadastroDespesaTelecomunicacao t = new CadastroDespesaTelecomunicacao();
					
				for (int i = 0; i < 1; i++) {
					String categoria = "Telecomunicação";
					String desc = JOptionPane.showInputDialog("Informe a descrição da despesa/(subcategoria):");
					String strValor = JOptionPane.showInputDialog("Informe o valor:");
					float valor = Float.parseFloat(strValor);
					Telecomunicacao a = new Telecomunicacao(categoria, desc, valor);
					t.adicionarDespesa(a);
				}
				break;
					
			case "Residencia":
				//Metodo pra escolher despesa Residencia
				//Cadastrar despesa residencia
				CadastroDespesaResidencia r = new CadastroDespesaResidencia();
				
				for (int i = 0; i < 1; i++) {
					String categoria = "Residencia";
					String desc = JOptionPane.showInputDialog("Informe a descrição da despesa/(subcategoria):");
					String strValor = JOptionPane.showInputDialog("Informe o valor:");
					float valor = Float.parseFloat(strValor);
					Residencia a = new Residencia(categoria, desc, valor);
					r.adicionarDespesa(a);
				}
				break;
					
			case "Outras Despesas":
				//Metodo pra escolher despesa do tipo Outros
				//Cadastrar despesas Outros Tipos;
				CadastroDespesaOutras o = new CadastroDespesaOutras();

				for (int i = 0; i < 1; i++) {
					String categoria = "Outras despesas";
					String desc = JOptionPane.showInputDialog("Informe a descrição da despesa/nome da despesa(subcategoria):");
					String strValor = JOptionPane.showInputDialog("Informe o valor da despesa:");
					float valor = Float.parseFloat(strValor);
					OutrasDespesas a = new OutrasDespesas(categoria, desc, valor);
					o.adicionarDespesa(a);
				}
				break;
				
			case "Retornar ao Menu Principal":
				break;
				
			default:
			break;
		}

		opcao = JOptionPane.showInputDialog(
				null, 
				"Menu Despesas", 
				"Opções", 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				opcoes, 
				opcoes[0]);
		} while (!opcao.toString().equalsIgnoreCase(opcoes[3]));
	}
}
