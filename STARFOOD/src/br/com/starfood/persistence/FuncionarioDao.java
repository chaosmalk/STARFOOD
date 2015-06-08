package br.com.starfood.persistence;

import br.com.startfood.entidade.Funcionario;

public class FuncionarioDao extends Dao {  
	public void create(Funcionario f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_funcionario(Id_Funcionario, Nome_Funcionario) VALUES(?,?)");  

		stmt.setInt(1, f.getId());  
		stmt.setString(2, f.getNomeFuncionario());  

		stmt.execute();        
		close();        
	}   
}
