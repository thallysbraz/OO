import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CadastroDespesaTelecomunicacao {
	//Telecomunicacao[] telecomunicacoes;
		List<Telecomunicacao> telecomunicacoes;
		public CadastroDespesaTelecomunicacao() {
			telecomunicacoes = new LinkedList<Telecomunicacao>();
		}
		public boolean adicionarDespesa(Telecomunicacao a) {
			// algoritmo para adicionar despesa
			boolean resposta = telecomunicacoes.add(a);
			return resposta;
		}
		public boolean removerDespesa(Telecomunicacao a) {
			// algoritmo para remover despesa
			boolean resposta = telecomunicacoes.remove(a);
			return resposta;
		}
		public Telecomunicacao pesquisarTelecomunicacao(String categoria) {
			//Algoritmo para pesquisar
			Telecomunicacao resposta = null;
			for(Telecomunicacao a: telecomunicacoes) {
				if(a.getCategoria().equalsIgnoreCase(categoria)){
					resposta = a;	
				}
			}
			return resposta;
		}
		public void imprimirDespesas() {
			Iterator<Telecomunicacao> it = telecomunicacoes.iterator();
			while(it.hasNext()){
			Telecomunicacao a = it.next();
			System.out.println(a);
			}
		}
}
