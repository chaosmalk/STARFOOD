package br.com.starfood.persistence;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.startfood.entidade.Funcionario;

public class FuncionarioDao extends Dao {  
	public void create(Funcionario f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_funcionario(Nome_Funcionario, Endereco_Func, Tel_Funcionario, Cel_Funcionario, Email_Funcionario, Password, RG, CPF) VALUES(?,?,?,?,?,?,?,?)");  

		stmt.setString(1, f.getNomeFuncionario());
		stmt.setString(2, f.getEnderecoFuncionario());  
		stmt.setInt(3, f.getTelFuncionario());  
		stmt.setInt(4, f.getcelFuncionario());  
		stmt.setString(5, f.getEmailFuncionario());  
		stmt.setString(6, f.getpassword());  
		stmt.setInt(7, f.getrg());  
		stmt.setInt(8, f.getcpf());  

		stmt.execute();        
		close();        
	}   
	
	public List<Funcionario> findAll() throws Exception{  
		open();  
		statement = con.createStatement();
		
		String sql = "SELECT Nome_Funcionario, Endereco_Func, Tel_Funcionario, Cel_Funcionario, Email_Funcionario, Password, RG, CPF FROM tb_funcionario";
		ResultSet rs = statement.executeQuery(sql);

		List<Funcionario> lista = new ArrayList<Funcionario>();
		while(rs.next()){
			Funcionario funcionario = new Funcionario();
			funcionario.setNomeFuncionario(rs.getString("Nome_Funcionario"));
			
			lista.add(funcionario);
		}
		rs.close();
		close(); 
		return lista;
	}
	
}
