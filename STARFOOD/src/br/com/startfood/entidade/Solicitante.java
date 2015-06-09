package br.com.startfood.entidade;

import java.sql.Date;

public class Solicitante {
	
	private Integer id;
	private String descricao;
	private String status;
	private Date dataPedido;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	
	public Date getdataPedido() {
		return dataPedido;
	}
	public void setdataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
}
