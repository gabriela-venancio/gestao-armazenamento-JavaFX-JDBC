package gui;

import MOCK.EstoqueMOCK;
import Modal.entitys.Estoque;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class EstadoAtual {
	
	public static Stage estadoAtual(ActionEvent evento) {
		return (Stage)((Node)evento.getSource()).getScene().getWindow();
	}

	
	public static Integer conversaoInteiro(String stg) {
		try{
			return Integer.parseInt(stg);
		}catch(NumberFormatException e ) {
			return null;
		}

	}
	EstoqueMOCK em = new EstoqueMOCK();
	public void salvarOuAltualizar(Estoque obj) {
		if(obj.getCodigo()==null) {
			em.salvar(obj);
		}
	}
}
