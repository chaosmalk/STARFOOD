package br.com.starfood.persistence;

import br.com.startfood.entidade.FormaPagamento;

public class PagamentoDao extends Dao {  
	public void create(Funcionario f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_form_pag(Descricao, Taxa) VALUES(?,?)");  

		stmt.setString(1, f.getDescricao());
		stmt.setInt(2, f.getTaxa());  
	
		stmt.execute();        
		close();        
	}   
}
