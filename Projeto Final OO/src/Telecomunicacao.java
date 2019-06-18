
public class Telecomunicacao {
	private String categoria;
	private float valor;
	private String desc;
	
	public Telecomunicacao(){
		
	}
	public Telecomunicacao(String c, String d, float v){
		setCategoria(c);
		setValor(v);
		setDesc(d);
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String toString() {
		String resposta = "";
		resposta += "Categoria: " + categoria + '\n';
		resposta += "Descri��o: " + desc + '\n';
		resposta += "Valor: " + valor + '\n';
		resposta += "-----------//-----------";	
		return resposta;
	}
}
