
package br_modelo_classe;

public class Venda {

	//Propriedade ou atributo
	private Vendedor vendedor;
	private Doce doce;
	private double codigoVenda;
	private static int vendaTotal;
	
	//Getters e Setters
	public void setCodigoVenda() {
		this.codigoVenda = (doce.getCodigo() + 1);
	}
	public double getCodigoVenda() {
		return this.codigoVenda;
	}
	
	public Vendedor getVendedor() {
		return this.vendedor;
	}
	
	public Doce getDoce() {
		return this.doce;
	}
	
	public static double getVendaTotal() {
		return vendaTotal;
	}
	
	//Método
	public void registraVenda(Vendedor vendedor, Doce doce) {
		this.vendedor = vendedor;
		this.doce = doce;
		Venda.vendaTotal += (doce.getPreco() * doce.getQuantidadeVendido());
	}


}

