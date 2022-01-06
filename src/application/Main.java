package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class Main extends Application {
	private static Scene mainscene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/TelaPrincipal.fxml"));
			ScrollPane scroll = loader.load();
			
			scroll.setFitToHeight(true);
			scroll.setFitToWidth(true);
			
			mainscene = new Scene(scroll);
			primaryStage.setScene(mainscene);
			primaryStage.setTitle("gerenciador de armazem");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}public static Scene getMainScene() {
			return mainscene;
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
