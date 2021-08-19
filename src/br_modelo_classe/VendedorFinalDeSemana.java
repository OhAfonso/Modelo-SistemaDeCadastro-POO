package br_modelo_classe;

public class VendedorFinalDeSemana extends Vendedor {

	//Construtor
	public VendedorFinalDeSemana(String nome, int idade, String cpf, int matricula, double salario) {
		super(nome, idade, cpf, matricula, salario);
	}
	
	//Método
	@Override
	public double calcularBonificassao(double vendido) {
		return getSalario() + (vendido * 1.0);
	}

}

