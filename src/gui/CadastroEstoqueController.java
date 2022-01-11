package gui;

import java.net.URL;
import java.util.ResourceBundle;

import MOCK.EstoqueMOCK;
import Modal.entitys.Estoque;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroEstoqueController implements Initializable {

	private Button btSalvar;
	
	private Button btCancelar;
	
	private Label btError;
	
	private TextField txtCodigo;
	
	private TextField txtNomeProduto;
	
	private TextField txtData;
	
	private TextField txtTipo;
	
	private TextField txtValorVendido;
	
	private TextField txtValorComprado;
	
	private TextField txtTempoEstoque;

	private TextField txtQuantidade;

	private Estoque obj;
	private EstoqueMOCK em= new EstoqueMOCK();
	


	public void onbtSalvarAction() {
		Estoque obj = getDadosEstoque();
		em.salvar(obj);
		
	}
	
	public void onbtCancelaAction() {
		System.out.println("cancelado");
		
	}

	private Estoque getDadosEstoque() {
		Estoque et = new Estoque();
		et.setCodigo(EstadoAtual.conversaoInteiro(txtCodigo.getText()));
		et.setNomeProduto(txtNomeProduto.getText());
		et.setData(txtData.getText());
		et.setTipo(EstadoAtual.conversaoInteiro(txtTipo.getText()));
		et.setValorComprado(txtValorComprado.getText());
		et.setValorVendido(txtValorVendido.getText());
		et.setQuantidade(EstadoAtual.conversaoInteiro(txtQuantidade.getText()));
		
		return et;
	}
	
	public void setEstoque(Estoque obj) {
		this.obj = obj;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
