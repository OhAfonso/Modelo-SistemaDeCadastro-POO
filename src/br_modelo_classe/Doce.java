
package br_modelo_classe;

public class Doce {

	//Propriedades ou atributos
	private String nomeProduto;
	private int codigo;
	private String marca;
	private int quantidadeVendido;
	private double preco;
	
	//Construtor
	public Doce(String nomeProduto, int codigo, String marca, int quantidadeVendido, double preco) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.marca = marca;
		this.quantidadeVendido = quantidadeVendido;
		this.preco = preco;
	}
	
	//Getters e Setters
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String marca() {
		return this.marca;
	}
	
	public void setQuantidadeVendido(int quantidadeVendido) {
		this.quantidadeVendido = quantidadeVendido;
	}
	public int getQuantidadeVendido() {
		return quantidadeVendido;
	}
	
	public void setpreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	
	//Método
	public String exibir() {
		String docePadrão = "Produto: " + this.nomeProduto +
							"\nCódigo: " + this.codigo +
							"\nMarca: " + this.marca +
							"\nQuantidade Vendida: " + this.quantidadeVendido +
							"\nPreço: " + this.preco;
		return docePadrão;
	}
	
	
}
