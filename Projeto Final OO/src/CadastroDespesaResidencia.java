import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class CadastroDespesaResidencia {
	//Residencia[] residencias;
	List<Residencia> residencias;
	public CadastroDespesaResidencia() {
		residencias = new LinkedList<Residencia>();
	}
	public boolean adicionarDespesa(Residencia a) {
		// algoritmo para adicionar despesa
		boolean resposta = residencias.add(a);
		return resposta;
	}
	public boolean removerDespesa(Residencia a) {
		// algoritmo remover despesa
		boolean resposta = residencias.remove(a);
		return resposta;
	}
	public Residencia pesquisarResidencia(String categoria) {
		//Algoritmo para pesquisar despesa
		Residencia resposta = null;
		for(Residencia a: residencias) {
			if(a.getCategoria().equalsIgnoreCase(categoria)){
				resposta = a;	
			}
		}
		return resposta;
	}
	public void imprimirDespesas() {
		Iterator<Residencia> it = residencias.iterator();
		while(it.hasNext()){
		Residencia a = it.next();
		System.out.println(a);
		}
	}
}
