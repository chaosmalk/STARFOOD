package br.com.starfood.persistence;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


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
	
	public List<Solicitante> findAll() throws Exception{  
		open();  
		statement = con.createStatement();
		
		String sql = "SELECT Descricao, Status FROM tb_solicitante";
		ResultSet rs = statement.executeQuery(sql);

		List<Solicitante> lista = new ArrayList<Solicitante>();
		while(rs.next()){
			Solicitante solicitante = new Solicitante();
			solicitante.setdescricao(rs.getString("Nome_Funcionario"));
			solicitante.setstatus(rs.getString("Endereco_Func"));
			
			
			lista.add(solicitante);
		}
		rs.close();
		close(); 
		return lista;
	}
}
