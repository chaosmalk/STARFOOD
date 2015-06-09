package br.com.startfood.entidade;

import java.sql.Date;

public class Produto {

	private Integer id;
	private Integer qtdProduto;
	private Integer idFornecedor;
	private Integer valorCompra;
	private Integer valorVenda;
	private String descProduto;
	private Date dataCompra;
	private Date dataValidade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getqtdProduto() {
		return qtdProduto;
	}
	public void setqtdProduto(Integer qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	
	public Integer getidFornecedor() {
		return idFornecedor;
	}
	public void setidFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	
	public Integer getvalorCompra() {
		return valorCompra;
	}
	public void setvalorCompra(Integer valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public Integer getvalorVenda() {
		return valorVenda;
	}
	public void setvalorVenda(Integer valorVenda) {
		this.valorCompra = valorVenda;
	}

	public String getdescProduto() {
		return descProduto;
	}
	public void setdescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public Date getdataCompra() {
		return dataCompra;
	}
	public void setdataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	public Date getdataValidade() {
		return dataValidade;
	}
	public void setdataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}
