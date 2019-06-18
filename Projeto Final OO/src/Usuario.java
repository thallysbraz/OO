import javax.swing.JOptionPane;

public class Usuario {
	public void novoUsuario() {
		main(null);
		
	}
		static Cadastrar c;
		static final String opcoes[] = {
			"-- Selecione sua opcao --",
			"Cadastrar Usuario", 
			"Pesquisar Usuario", 
			"Deletar Usuario", 
			"Gravar Usuario em arquivo", 
			"Ler Usuarios de arquivo", 
			"Retornar ao Menu Principal"
		};
	
		public static void main(String[] args) {
			c = new Cadastrar();
		
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
				case "Cadastrar Usuario":
					cadastrarPessoa();
					break;
				case "Pesquisar Usuario":
					pesquisarPessoa();
					break;
				
				case "Deletar Usuario":
					deletarPessoa();
					break;
				
				case "Gravar Usuario em arquivo": 
					gravarEmArquivo();
					break;
			
				case "Ler Usuarios de arquivo":
					lerPessoaDeArquivo();
					break;

				default:
				break;
			}
			
			opcao = JOptionPane.showInputDialog(
					null, 
					"Menu de Usuario", 
					"Usuario", 
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcoes, 
					opcoes[0]);
			} while (!opcao.toString().equalsIgnoreCase(opcoes[6]));
		}

		private static void lerPessoaDeArquivo() {
			JOptionPane.showMessageDialog(null, "Entrou em Ler arquivos");
			boolean resposta; 
			resposta = c.lerArquivo();
			if (resposta)
				JOptionPane.showMessageDialog(null, "Usuario lidos com sucesso");
		}

		private static void gravarEmArquivo() {
			boolean resposta = c.gravarPessoaEmArquivo();
			if (resposta) 
				JOptionPane.showMessageDialog(null, "Usuario gravados com sucesso");
		}

		private static void deletarPessoa() {
			Pessoa p = pesquisarPessoa();
			int escolha = JOptionPane.showConfirmDialog(null, 
						"Deseja mesmo deletar o Usuario?", 
						"Deletar?", 
						JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE);
			if (escolha == JOptionPane.YES_OPTION) {
				boolean deletado = c.deletarPessoa(p);
				if (deletado) 
					JOptionPane.showMessageDialog(null, "Usuario deletado");
				else 
					JOptionPane.showMessageDialog(null, "Usuario não deletado");
			}
		}

		private static Pessoa pesquisarPessoa() {
			String nome = JOptionPane.showInputDialog("Qual o nome?");
			String email = JOptionPane.showInputDialog("Qual o email?");
		
			Pessoa p = c.pesquisarPessoa(nome, email);
			JOptionPane.showMessageDialog(null, p);
			return p;
		}

		private static boolean cadastrarPessoa() {
			String nome = JOptionPane.showInputDialog("Nome");
			String email = JOptionPane.showInputDialog("Email");
			String strRendimento = JOptionPane.showInputDialog("Rendimento");
		
			float rend = Float.parseFloat(strRendimento);
		
			Pessoa p = new Pessoa(nome, email, rend);
			boolean resposta = c.cadastrarPessoa(p);
			if (resposta)
				JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
			return resposta;
		}
}
