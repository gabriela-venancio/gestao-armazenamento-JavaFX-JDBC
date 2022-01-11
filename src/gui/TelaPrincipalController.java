package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import MOCK.EstoqueMOCK;
import alerts.Alertas;
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
	private MenuItem menuItemBuscarVendas;
		
	@FXML
	private void onbtCadastrarVenda() {
		carregaTela("/gui/CadastrarVendaView.fxml", x -> {});
	}
	
	@FXML
	private void onbtListaVendaAction() {
		carregaTela("/gui/ListaVendas.fxml", x -> {});
	}
	
		
		@FXML
	private MenuItem menuItemCadastrarProdutos;
		
	@FXML
	private MenuItem menuItemBuscarProdutos;
	@FXML
	private void onbtCadastrarProdutoAction() {
		carregaTela("/gui/CadastrarProduto.fxml", x -> {});
	}
	
	@FXML
	private void onbtListaProdutoAction() {
		carregaTela("/gui/ListaProduto.fxml", x -> {});
	}
	
	
	@FXML
	private MenuItem menuItemCadastrarForncedores;
	
	@FXML
	private MenuItem menuItemBuscarFornecedores;
	
	@FXML
	private void onbtCadastrarFornecedor() {
		carregaTela("/gui/CadastrarFornecedor.fxml", x -> {});
	}
	
	@FXML
	private void onbtListaFornecedorAction() {
		carregaTela("/gui/ListaFornecedor.fxml", x -> {});
	}
	
	
	@FXML
	private MenuItem menuItemCadastrarEstoque;
	
	@FXML 
	private MenuItem menuItemBuscarEstoque;
	@FXML
	private void onbtCadastrarEstoqueAction() {
		carregaTela("/gui/CadastrarEstoque.fxml",  x -> {});
	}
	
	@FXML
	private void onbtListaEstoqueAction() {
		carregaTela("/gui/ListaEstoque.fxml", (ListaEstoqueController controller)->{ 
			controller.setListarEstoque(new EstoqueMOCK());
			try {
				controller.updateTableView();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	


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
	private Button btCancelarVenda;
	
	
	private synchronized <T> void carregaTela (String tela, Consumer <T> inicializaAcao)  {
	 
		try {		
			FXMLLoader carregar = new FXMLLoader(getClass().getResource(tela));

			VBox nvbox= carregar.load();
			
			Scene mainscene = Main.getMainScene();
			VBox mainVBox=(VBox)((ScrollPane) mainscene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(nvbox.getChildren());
			
			T controller = carregar.getController();
			inicializaAcao.accept(controller);
			
		} catch (IOException e) {
			Alertas.showAlert("IO","Error", e.getMessage(), AlertType.ERROR);
			e.printStackTrace();
		}}}
	
	
			
	
	