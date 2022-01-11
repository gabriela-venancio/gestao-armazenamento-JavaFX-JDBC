package MOCK;
import java.util.ArrayList;
import java.util.List;

import Modal.entitys.Estoque;

public class EstoqueMOCK { 

	
	
	
	public List<Estoque> buscarItens(){
		List <Estoque> listaEstoque = new ArrayList<>();
		listaEstoque.add(new Estoque(1001,"Linha de nailom","11/12/2021",2,15.22,12.22,"54 dias",20));
		listaEstoque.add(new Estoque(1002,"barbante","05/11/2021",5,12.22,12.22,"80 dias",220));
		listaEstoque.add(new Estoque(1003,"Linha ","15/09/2021",6,75.25,12.22,"90 dias",40));
		listaEstoque.add(new Estoque(1005,"Linha ruim ","15/09/2021",6,75.25,12.22,"90 dias",40));

		return listaEstoque;
		
		
	}
}
