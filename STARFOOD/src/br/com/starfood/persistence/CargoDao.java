package br.com.starfood.persistence;

import br.com.startfood.entidade.Funcao;

public class CargoDao extends Dao {  
	public void create(Funcao f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_funcao( Descricao) VALUES(?,?)");  

	
		stmt.setString(1, f.getdescricao());  
		
		stmt.execute();        
		close();        
	}   
}
