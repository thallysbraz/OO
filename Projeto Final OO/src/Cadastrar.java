import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


	public class Cadastrar {
	
	List<Pessoa> pessoas;
	
	public Cadastrar() {
		pessoas = new LinkedList<Pessoa> ();
	}
	public boolean cadastrarPessoa(Pessoa p) {
		boolean resposta = false;
		if (pessoas == null) 
			pessoas = new LinkedList<Pessoa>();
		resposta = pessoas.add(p);
		return resposta;
	}
	
	public Pessoa pesquisarPessoa(String nome, String email) {
		Pessoa resposta = null;
		Iterator<Pessoa> it = pessoas.iterator();
		
		while (it.hasNext()) {
			Pessoa p = it.next();
			if (p.getNome().equalsIgnoreCase(nome) &&
				p.getEmail().equalsIgnoreCase(email)) 
				resposta = p;
		}
		return resposta;
	}
	
	public boolean deletarPessoa(Pessoa p) {
		boolean resposta = false;
		if (pessoas.contains(p))
			resposta = pessoas.remove(p);
		return resposta;
	}

	public boolean gravarPessoaEmArquivo() {
		boolean resposta = false;
		FileWriter arquivo = null;
		try {
			arquivo = new FileWriter("usuarios.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		Iterator<Pessoa> it = pessoas.iterator();
		while (it.hasNext()) {
			Pessoa v = it.next();
			String str = "";
			str += v.getNome() + ";";
			str += v.getEmail() + ";";
			str += v.getRendimento() + ";";
			
			try {
				buffer.write(str);
				buffer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			buffer.close();
			resposta = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resposta;
	}

	public boolean lerArquivo() {
		FileReader arquivo = null;
		BufferedReader buffer;
		boolean resposta; 
		String nomeArquivo = "usuarios.txt";
		try {
			arquivo = new FileReader(nomeArquivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		buffer = new BufferedReader(arquivo);
		
		String line = "";
		try {
			line = buffer.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		do {
			String[] campos = line.split(";");
			
			float rendimento = Float.parseFloat(campos[2]);
			
			Pessoa p = new Pessoa(campos[0], campos[1], rendimento);
			
			if (pessoas == null){ 
				pessoas = new LinkedList<Pessoa>();
			}
			resposta = pessoas.add(p);
			
			try {
				line = buffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} while (line != null);
		
		return resposta;
	}
}
