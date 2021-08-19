package br_modelo_classe;

public class VendedorSemana extends Vendedor {

	//Construtor
	public VendedorSemana(String nome, int idade, String cpf, int matricula, double salario) {
		super(nome, idade, cpf, matricula, salario);
	}
	
	//Métodos
	@Override
	public double calcularBonificassao(double vendido) {
		return vendido * 1.5;
	}
	
}