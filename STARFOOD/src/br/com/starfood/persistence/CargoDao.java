package br.com.starfood.persistence;

import br.com.startfood.entidade.Funcao;

public class CargoDao extends Dao {  
	public void create(Funcao f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_funcao(Id_Funcao, Descricao) VALUES(?,?)");  

		stmt.setInt(1, f.getIdFuncao());
		stmt.setString(2, f.getDescricao());  
		
		stmt.execute();        
		close();        
	}   
}
