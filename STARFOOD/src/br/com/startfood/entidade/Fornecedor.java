package br.com.startfood.entidade;

import java.sql.Date;

public class Fornecedor {

	private Integer id;
	private Integer telFornecedor;
	private Integer celFornecedor;
	private Integer cnpj;
	private Integer inscricaoEstadual;
	private String razaoSocial;
	private String enderecoFornecedor;
	private String emailFornecedor;
	private String obsFornecedor;
	private Date dataCadastro;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer gettelFornecedor() {
		return telFornecedor;
	}
	public void settelFornecedor(Integer telFornecedor) {
		this.telFornecedor = telFornecedor;
	}

	public Integer getcelFornecedor() {
		return celFornecedor;
	}
	public void setcelFornecedor(Integer celFornecedor) {
		this.celFornecedor = celFornecedor;
	}
	
	public Integer getcnpj() {
		return cnpj;
	}
	public void setcnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
	public Integer getinscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setinscricaoEstadual(Integer inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getrazaoSocial() {
		return razaoSocial;
	}
	public void setrazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getenderecoFornecedor() {
		return enderecoFornecedor;
	}
	public void setenderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}
	
	public String getemailFornecedor() {
		return emailFornecedor;
	}
	public void setemailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}
	
	public String getobsFornecedor() {
		return obsFornecedor;
	}
	public void setobsFornecedor(String obsFornecedor) {
		this.obsFornecedor = obsFornecedor;
	}
	
	public Date getdataCadastro() {
		return dataCadastro;
	}
	public void setdataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
