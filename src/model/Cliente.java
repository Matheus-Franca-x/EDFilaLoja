package model;

public class Cliente {

	private String nome;
	private int quantidadePecas;
	private float valorPecas;
	
	
	public Cliente(String nome, int qtd, float valor) 
	{
		this.nome = nome;
		this.quantidadePecas = qtd;
		this.valorPecas = valor;
	}


	public String getNome() {
		return nome;
	}


	public int getQuantidadePecas() {
		return quantidadePecas;
	}


	public float getValorPecas() {
		return valorPecas;
	}
	

}
