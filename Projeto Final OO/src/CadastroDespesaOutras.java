import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CadastroDespesaOutras {
	List<OutrasDespesas> outrasdesp;
	public CadastroDespesaOutras() {
		outrasdesp = new LinkedList<OutrasDespesas>();
	}
	public boolean adicionarDespesa(OutrasDespesas a) {
		// algoritmo para adicionar despesa
		boolean resposta = outrasdesp.add(a);
		return resposta;
	}
	public boolean removerDespesa(OutrasDespesas a) {
		// algoritmo remover despesa
		boolean resposta = outrasdesp.remove(a);
		return resposta;
	}
	public OutrasDespesas pesquisarResidencia(String categoria) {
		//Algoritmo para pesquisar despesa
		OutrasDespesas resposta = null;
		for(OutrasDespesas a: outrasdesp) {
			if(a.getCategoria().equalsIgnoreCase(categoria)){
				resposta = a;	
			}
		}
		return resposta;
	}
	public void imprimirDespesas() {
		Iterator<OutrasDespesas> it = outrasdesp.iterator();
		while(it.hasNext()){
		OutrasDespesas a = it.next();
		System.out.println(a);
		}
	}
}
