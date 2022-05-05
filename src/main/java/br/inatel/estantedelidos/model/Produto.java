package br.inatel.estantedelidos.model;

public class Produto {

	private String nome;
	private String tipo;
	private float valor;
	private int vendedorId;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void setVendedorId(int vendedorId) {
		this.vendedorId = vendedorId;
	}
	public int getVendedorId() {
		return vendedorId;
	}
}

