package br_modelo_teste;

import br_modelo_classe.Doce;
import br_modelo_classe.Venda;
import br_modelo_classe.VendedorSemana;

public class Teste01 {

	public static void main(String[] args) {
		
		//Doces
		Doce doce1 = new Doce("Lollo", 001, "Nestlé", 50, 0.89);
		Doce doce2 = new Doce("BIS", 002, "Lacta", 100, 3.49);
		
		//Vendedor
		VendedorSemana vend1 = new VendedorSemana("Vinicius", 22, "333.666.333-88", 11111111, 1500);

		//Registra a venda
		Venda sold1 = new Venda();
		
		sold1.registraVenda(vend1, doce2);
		
		System.out.println(sold1.getVendedor() + "\nBonificassao: " + vend1.calcularBonificassao(doce1.getQuantidadeVendido()) +
													"\nSalário Total: " + vend1.calcularSalarioTotal(vend1.calcularBonificassao(doce1.getQuantidadeVendido())) +
													"\n" + 
													"\nDoce: " + sold1.getDoce().exibir() + 
													"\nCódigo da Venda: " + sold1.getCodigoVenda() +
													"\n------------------------------------------------" +
													"\nVenda total: " + sold1.getVendaTotal());
		
		
		
		
	}

}
