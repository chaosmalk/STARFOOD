package br.com.starfood.persistence;

import br.com.startfood.entidade.FormaPagamento;

public class PagamentoDao extends Dao {  
	public void create(FormaPagamento f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_form_pag(Descricao, Taxa) VALUES(?,?)");  

		stmt.setString(1, f.getdescricao());
		stmt.setInt(2, f.gettaxa());  
	
		stmt.execute();        
		close();        
	}   
}
