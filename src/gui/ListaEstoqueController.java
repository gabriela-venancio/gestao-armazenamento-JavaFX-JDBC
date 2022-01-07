package gui;

import java.net.URL;
import java.util.ResourceBundle;

import Modal.entitys.Estoque;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListaEstoqueController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	
	@FXML
	private TableView<Estoque>tabelaListaEstoque;
	
	
	@FXML
	private TableColumn<Estoque, String>TabelaColumnaNomeProduto;
	

	@FXML
	private TableColumn<Estoque, String>TabelaColumnData;
	

	@FXML
	private TableColumn<Estoque, Integer>TabelaColumnaTipo;
	

	@FXML
	private TableColumn<Estoque, Double>TabelaColumnaValorVendido;

	@FXML
	private TableColumn<Estoque, Double>TabelaColumnaValorComprado;
	

	@FXML
	private TableColumn<Estoque, String>TabelaColumnTempoEstoque; 

	@FXML
	private TableColumn<Estoque, Integer>TabelaColumnaQuantidade;


	@FXML
	private TableColumn<Estoque, Integer>TabelaColumnaCodigo;	

}
