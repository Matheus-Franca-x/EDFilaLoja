package controller;

import controllerFila.FilaObject;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() 
	{
		
	}
	
	public void caixa(FilaObject fila)
	{
		Cliente calc = null;
		
		try {
			while(!fila.filaVazia())
			{
				calc = (Cliente) fila.remove();			
				
				float valorTotal = calc.getQuantidadePecas() * calc.getValorPecas();
				
				System.out.println("O cliente " +calc.getNome() + " pagara no total: " + valorTotal);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
