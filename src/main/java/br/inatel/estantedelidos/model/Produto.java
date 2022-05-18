package br.inatel.estantedelidos.model;

public class Produto {

	private String nomeVendedor;
	private String telefone;
	private String nomeProduto;
	private String tipo;
	private float valor;
	private boolean gratis;
	
	public Produto(String nomeVendedor, String telefone, String nomeProduto, String tipo, float valor, boolean gratis) {
		this.nomeVendedor = nomeVendedor;
		this.telefone = telefone;
		this.nomeProduto = nomeProduto;
		this.tipo = tipo;
		this.valor = valor;
		this.gratis = gratis;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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

	public boolean isGratis() {
		return gratis;
	}

	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}
}

