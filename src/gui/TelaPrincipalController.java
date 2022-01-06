package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class TelaPrincipalController implements Initializable {

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}
	
	@FXML
	private MenuItem menuItemCadastrarVendas;
	
	@FXML
	private MenuItem menuItemCadastrarProdutos;
	
	@FXML
	private MenuItem menuItemCadastrarForncedores;
	
	@FXML
	private MenuItem menuItemCadastrarEstoque;
	
	@FXML
	private MenuItem menuItemBuscarProdutos;


	@FXML
	private MenuItem menuItemBuscarVendas;
	

	@FXML
	private MenuItem menuItemBuscarFornecedores;
	

	@FXML
	private MenuItem menuItemBuscarEstoque;
	

	@FXML
	private MenuItem menuItemVisualizarEvento;
	

	@FXML
	private MenuItem menuItemAgendarEvento;
	

	@FXML
	private MenuItem menuItemRelatorioVendas;
	

	@FXML
	private MenuItem menuItemRelatorioProduto;
	

	@FXML
	private MenuItem menuItemRelatorioEstoque;
	

	@FXML
	private MenuItem menuItemRelatorioFornecedor;
	
	@FXML
	private Button btCadastrarVenda;
	
	@FXML
	private void onbtCadastrarVenda() {
		carregaTela("/gui/CadastrarVendaView.fxml");
	}
	
	@FXML
	private Button btCancelarVenda;
	
	
	private void carregaTela (String tela) {
	
		try {		
			FXMLLoader carregar = new FXMLLoader(getClass().getResource(tela));

			VBox nvbox= carregar.load();
			
			Scene mainscene = Main.getMainScene();
			VBox mainVBox=(VBox)((ScrollPane) mainscene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(nvbox.getChildren());
			
		} catch (IOException e) {
			Alertas.showAlert("IO","Error", e.getMessage(), AlertType.ERROR);
			e.printStackTrace();
		}
	}
}
