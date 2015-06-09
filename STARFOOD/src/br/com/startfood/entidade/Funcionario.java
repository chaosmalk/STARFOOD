package br.com.startfood.entidade;

import java.sql.Date;

public class Funcionario {

	private Integer id;
	private String nomeFuncionario;
	private String enderecoFuncionario;
	private Integer telFuncionario;
	private String emailFuncionario;
	private Integer idFuncao;
	private String password;
	private String estado;
	private Integer rg;
	private Integer cpf;
	private Date dataNasc;
	private Integer celFuncionario;
	private Date dataEntrada;
	private Date dataSaida;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
		public String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}
	public void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}
	public Integer getTelFuncionario() {
		return telFuncionario;
	}
	public void setTelFuncionario(Integer telFuncionario) {
		this.telFuncionario = telFuncionario;
	}
	public String getEmailFuncionario() {
		return emailFuncionario;
	}
	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}
	public Integer getIdFuncao() {
		return idFuncao;
	}
	public void setIdFuncao(Integer idFuncao) {
		this.idFuncao = idFuncao;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getestado() {
		return estado;
	}
	public void setestado(String estado) {
		this.estado = estado;
	}
	public Integer getrg() {
		return rg;
	}
	public void setrg(Integer rg) {
		this.rg = rg;
	}	
	public Integer getcpf() {
		return cpf;
	}
	public void setcpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Date getdataNasc() {
		return dataNasc;
	}
	public void setdataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Integer getcelFuncionario() {
		return celFuncionario;
	}
	public void setcelFuncionario(Integer celFuncionario) {
		this.celFuncionario = celFuncionario;
	}
	public Date getdataEntrada() {
		return dataEntrada;
	}
	public void setdataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getdataSaida() {
		return dataSaida;
	}
	public void setdataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
}
