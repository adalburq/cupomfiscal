package br.com.fullstack.model;

import java.util.ArrayList;
import java.util.List;

public class CupomFiscal {

	private Integer id;
	private String cnpj;
	private String nome;
	private String data;
	private String hora;
	private String coo;
	private Double valorTotal;
<<<<<<< HEAD
	private List<Item> itens = new ArrayList<Item>();
	
=======
	private List<Item> itens;	
>>>>>>> b84da5b1b1ee18456b78016894de314195a7c2d8
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getCoo() {
		return coo;
	}
	public void setCoo(String coo) {
		this.coo = coo;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
	
}
