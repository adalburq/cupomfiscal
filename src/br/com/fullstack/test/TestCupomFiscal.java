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
		
		Produto p1 = new Produto();
		p1.setId(11);
		p1.setCod(12538);
		p1.setDesc("farinha");
		p1.setValor(7.19);
		
		Item i = new Item();
		i.setId(1);
		i.setQtd(2);
		i.setValorTotal(calculoValorTotalDoItem(p, i));
<<<<<<< HEAD
		i.setProduto(p);
		
		Item i1 = new Item();
		i1.setId(2);
		i1.setQtd(3);
		i1.setValorTotal(calculoValorTotalDoItem(p1, i1));
		i1.setProduto(p1);
		
=======
		System.out.println("produto:" + i.getProduto());
		i.setProduto(p);
		System.out.println("produto:" + i.getProduto());
		p.getDesc();
		i.getProduto().getDesc();

>>>>>>> b84da5b1b1ee18456b78016894de314195a7c2d8
		CupomFiscal c = new CupomFiscal();
		c.setId(15);
		c.setCnpj("12345678113456");
		c.setNome("SuperMercado Fullstack");
		c.setCoo("018980");
		c.setValorTotal(calculoValorTotalDoCupom(c));
		c.getItens().add(i);
		c.getItens().add(i1);
		
		System.out.println(c.getNome() + " " + c.getItens().size());
		System.out.println(c.getItens().get(0).getProduto().getDesc());
		System.out.println(c.getItens().get(1).getProduto().getDesc());
		
		//c.setItens(); proxima aula
	

	}
	
	public static Double calculoValorTotalDoItem(Produto produto,Item item) {
		//System.out.println(produto.getValor());
		Double calculo = produto.getValor() * item.getQtd();
		return  calculo;
		
	}

	public static Double calculoValorTotalDoCupom(CupomFiscal c) {
		Double soma = 0.0;
		for (int j = 0; j < c.getItens().size(); j++) {
			 soma = soma + c.getItens().get(j).getValorTotal();
		}
		
		return soma;
	}
}
