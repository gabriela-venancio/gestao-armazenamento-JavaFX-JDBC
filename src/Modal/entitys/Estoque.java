package Modal.entitys;

import java.util.List;

public class Estoque {

	Integer codigo;
	String nomeProduto;
	String data;
	Integer tipo;
	String valorVendido;
	String valorComprado;
	String tempoEstoque;
	Integer quantidade;
	public Estoque(Integer codigo, String nomeProduto, String data, Integer tipo, String valorVendido, String valorComprado,
			String tempoEstoque, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.data = data;
		this.tipo = tipo;
		this.valorVendido = valorVendido;
		this.valorComprado = valorComprado;
		this.tempoEstoque = tempoEstoque;
		this.quantidade = quantidade;
	}
	public Estoque() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getValorVendido() {
		return valorVendido;
	}
	public void setValorVendido(String valorVendido) {
		this.valorVendido = valorVendido;
	}
	public String getValorComprado() {
		return valorComprado;
	}
	public void setValorComprado(String string) {
		this.valorComprado = string;
	}
	public String getTempoEstoque() {
		return tempoEstoque;
	}
	public void setTempoEstoque(String tempoEstoque) {
		this.tempoEstoque = tempoEstoque;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
