package br.com.starfood.persistence;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.startfood.entidade.Funcao;

public class CargoDao extends Dao {  
	public void create(Funcao f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_funcao( Descricao) VALUES(?)");  

	
		stmt.setString(1, f.getdescricao());  
		
		stmt.execute();        
		close();        
	} 
	
	public List<Funcao> findAll() throws Exception{  
		open();  
		statement = con.createStatement();
		
		String sql = "SELECT Descricao FROM tb_funcao";
		ResultSet rs = statement.executeQuery(sql);

		List<Funcao> lista = new ArrayList<Funcao>();
		while(rs.next()){
			Funcao funcao = new Funcao();
			funcao.setdescricao(rs.getString("Descricao"));
			
			
			lista.add(funcao);
		}
		rs.close();
		close(); 
		return lista;
	}
}
