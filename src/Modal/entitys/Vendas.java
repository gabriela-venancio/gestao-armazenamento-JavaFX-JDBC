package Modal.entitys;

public class Vendas {

	int codigo;
	String nomeProduto;
	int tipo;
	String dataVenda;
	int cpfCliente;
	int quantidade;
	public Vendas(int codigo, String nomeProduto, int tipo, String dataVenda, int cpfCliente, int quantidade) {
		super();
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.tipo = tipo;
		this.dataVenda = dataVenda;
		this.cpfCliente = cpfCliente;
		this.quantidade = quantidade;
	}
	public int getCodigo() {
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public int getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
