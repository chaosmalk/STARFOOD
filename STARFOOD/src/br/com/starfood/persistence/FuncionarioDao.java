package br.com.starfood.persistence;

import br.com.startfood.entidade.Funcionario;

public class FuncionarioDao extends Dao {  
	public void create(Funcionario f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_funcionario(Nome_Funcionario) VALUES(?)");  

		stmt.setString(1, f.getNomeFuncionario());  

		stmt.execute();        
		close();        
	}   
}
