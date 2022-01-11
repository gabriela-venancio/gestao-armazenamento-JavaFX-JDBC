package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import MOCK.EstoqueMOCK;
import Modal.entitys.Estoque;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ListaEstoqueController implements Initializable {

	
	@FXML
	private TableView<Estoque> tabelaListaEstoque;

	@FXML
	private TableColumn<Estoque, Integer> TabelaColumnaCodigo;

	@FXML
	private TableColumn<Estoque, String> TabelaColumnaNomeProduto;

	@FXML
	private TableColumn<Estoque, String> TabelaColumnData;

	@FXML
	private TableColumn<Estoque, Integer> TabelaColumnaTipo;

	@FXML
	private TableColumn<Estoque, Double> TabelaColumnaValorVendido;

	@FXML
	private TableColumn<Estoque, Double> TabelaColumnaValorComprado;

	@FXML
	private TableColumn<Estoque, String> TabelaColumnTempoEstoque;

	@FXML
	private TableColumn<Estoque, Integer> TabelaColumnaQuantidade;
	
	private ObservableList<Estoque> obslist;

	private EstoqueMOCK service;

	
	public void  setListarEstoque(EstoqueMOCK service) {
		this.service= service;
	}

	public void updateTableView() throws Exception {
		if(service==null) {
			throw new Exception("service estava nullo");
		}
		List<Estoque> list = service.buscarItens();  
		obslist= FXCollections.observableArrayList(list);
		tabelaListaEstoque .setItems(obslist);
	
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		inizia();
	}
	
	private void inizia() {
		
		TabelaColumnaCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
		TabelaColumnaNomeProduto.setCellValueFactory(new PropertyValueFactory<>("nomeProduto"));
		TabelaColumnData.setCellValueFactory(new PropertyValueFactory<>("data"));
		TabelaColumnaTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
		TabelaColumnaValorVendido.setCellValueFactory(new PropertyValueFactory<>("valorVendido"));
		TabelaColumnaValorComprado.setCellValueFactory(new PropertyValueFactory<>("valorComprado"));
		TabelaColumnTempoEstoque.setCellValueFactory(new PropertyValueFactory<>("tempoEstoque"));
		TabelaColumnaQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
 		tabelaListaEstoque.prefHeightProperty().bind(stage.heightProperty());


	}
}
