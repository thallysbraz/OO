public class Pessoa {

	String nome, 
    email;
	float rendimento;

	Pessoa (String nome, String email, float rendimento) {
		this.nome = nome;
		this.email = email;
		this.rendimento = rendimento;
	}
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	public String toString() {
		String resposta = "";
		resposta += "Nome: " + nome + '\n';
		resposta += "Email: " + email + '\n';
		resposta += "Rendimento: " + rendimento + '\n';
		return resposta;
	}
	public float getRendimento() {
		return rendimento;
	}
}
