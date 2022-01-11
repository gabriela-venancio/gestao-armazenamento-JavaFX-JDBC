package Modal.entitys;

import java.util.List;

public class Estoque {

	Integer codigo;
	String nomeProduto;
	String data;
	Integer tipo;
	double valorVendido;
	double valorComprado;
	String tempoEstoque;
	Integer quantidade;
	public Estoque(Integer codigo, String nomeProduto, String data, Integer tipo, double valorVendido, double valorComprado,
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
	public double getValorVendido() {
		return valorVendido;
	}
	public void setValorVendido(double valorVendido) {
		this.valorVendido = valorVendido;
	}
	public double getValorComprado() {
		return valorComprado;
	}
	public void setValorComprado(double valorComprado) {
		this.valorComprado = valorComprado;
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
