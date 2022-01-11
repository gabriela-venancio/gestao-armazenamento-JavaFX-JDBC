package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import MOCK.EstoqueMOCK;
import Modal.entitys.Estoque;
import alerts.Alertas;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ListaEstoqueController implements Initializable {

	@FXML
	private Button btSalvarItem;
	@FXML
	private void onbtSalvarAction(ActionEvent event) {
		Stage estadoAtual = EstadoAtual.estadoAtual(event);
		cadastrarItem(null, "/gui/CadastroEstoque.fxml", estadoAtual);
		
	}
	
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
	
	private void cadastrarItem(Estoque tela, String estadoAtual, Stage pain) {
		try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource(estadoAtual));
				Pane painel = loader.load();
				
				CadastroEstoqueController controller = loader.getController();
				controller.setEstoque(tela);
				
				
			
				Stage estadoDialogo= new Stage();
				estadoDialogo.setTitle("cadastro de Item");
				estadoDialogo.setScene(new Scene(painel));
				estadoDialogo.initOwner(pain);
				estadoDialogo.initModality(Modality.WINDOW_MODAL);
				estadoDialogo.showAndWait();
		}
		catch(Exception e) {
			Alertas.showAlert("IOEXception",null,e.getMessage(),AlertType.ERROR);
		
	}}
}
