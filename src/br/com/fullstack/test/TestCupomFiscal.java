package br.com.fullstack.test;

import br.com.fullstack.model.CupomFiscal;
import br.com.fullstack.model.Item;
import br.com.fullstack.model.Produto;

public class TestCupomFiscal {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setId(10);
		p.setCod(12345);
		p.setDesc("nutella");
		p.setValor(42.19);
		
		Item i = new Item();
		i.setId(1);
		i.setQtd(2);
		i.setValorTotal(calculoValorTotalDoItem(p, i));
		System.out.println("produto:" + i.getProduto());
		i.setProduto(p);
		System.out.println("produto:" + i.getProduto());
		p.getDesc();
		i.getProduto().getDesc();

		CupomFiscal c = new CupomFiscal();
		c.setId(15);
		c.setCnpj("12345678113456");
		c.setNome("SuperMercado Fullstack");
		c.setCoo("018980");
		//c.setValorTotal();
		//c.setItens(); proxima aula
	

	}
	
	public static Double calculoValorTotalDoItem(Produto p,Item i) {
		Double calculo = p.getValor() * i.getQtd();
		return calculo;
		
	}

	public static Double calculoValorTotalDoCupom(CupomFiscal c) {
		Double soma = 0.0;
		for (int j = 0; j < c.getItens().size(); j++) {
			 soma = soma + c.getItens().get(j).getValorTotal();
		}
		
		return soma;
	}
}
