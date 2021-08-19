package br_modelo_classe;

public abstract class Vendedor extends Funcionario{

	//Construtor
	public Vendedor(String nome, int idade, String cpf, int matricula, double salario) {
		super(nome, idade, cpf, matricula, salario);

	}
	
	//Métodos
	public abstract double calcularBonificassao(double venda);

	public double calcularSalarioTotal(double vendaTotal) {
		return getSalario() + vendaTotal;
	}
	
	
}

