package br.com.starfood.persistence;

import br.com.startfood.entidade.Solicitante;

public class MesaDao extends Dao {  
	public void create(Solicitante f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_solicitante(Descricao, Status) VALUES(?,?)");  

		stmt.setString(1, f.getdescricao());
		stmt.setString(1, f.getstatus());
		
	

		stmt.execute();        
		close();        
	}   
}
