package view;

import controller.OperacaoController;
import controllerFila.FilaObject;
import model.Cliente;

public class Main {

	public static void main(String[] args) 
	{
		FilaObject fila = new FilaObject();
		OperacaoController vendedor = new OperacaoController();
		
		
		for(int i = 1; i <= 20; i++)
		{
			String nome = "cliente";
			nome += i;
			
			fila.insert(new Cliente(nome,(int) (Math.random() * 31) + 20, (int) (Math.random() * 96) + 5));	
		}
		
		
		vendedor.caixa(fila);
		

	}

}
