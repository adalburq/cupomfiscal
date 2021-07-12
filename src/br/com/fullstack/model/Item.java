package br.com.fullstack.model;

public class Item {
	
	private Integer id;
	private Integer qtd;
	private Double valorTotal;
	private Item item;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	

}
