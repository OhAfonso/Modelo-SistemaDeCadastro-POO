package br_modelo_classe;

public abstract class Funcionario {

	//Propriedade ou atributo
	private String nome;
	private int idade;
	private String cpf;
	private int matricula;
	private double salario;
	
	//Construtor
	public Funcionario(String nome, int idade, String cpf, int matricula, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}
	
	//Getter e Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	
	
	//Sobrescrevendo o método toString() da classe Object
	@Override
	public String toString() {
		String funcionarioPadrao = "Nome: " + this.nome +
									"\nIdade: " + this.idade +
									"\nCPF: " + this.cpf +
									"\nMatrícula: " + this.matricula +
									"\nSalário: " + this.salario;
		return funcionarioPadrao;
	}
	
		
	
}

	

