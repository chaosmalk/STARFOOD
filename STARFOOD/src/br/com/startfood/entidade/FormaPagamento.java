package br.com.startfood.entidade;

public class FormaPagamento {

	private Integer id;
	private Integer taxa;
	private String descricao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer gettaxa() {
		return taxa;
	}
	public void settaxa(Integer taxa) {
		this.taxa = taxa;
	}
	
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
}
