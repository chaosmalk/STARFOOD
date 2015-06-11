package br.com.starfood.persistence;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.startfood.entidade.Fornecedor;

public class FornecedorDao extends Dao {  
	public void create(Fornecedor f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_fornecedor(Razao_Social, Data_Cadastro,End_Fornecedor,Tel_Fornecedor, Cel_Fornecedor, Email_Fornecedor, CNPJ, Inscr_Estadual, Obs_Fornecedor) VALUES(?,?,?,?,?,?,?,?,?)");  

		stmt.setString(1, f.getrazaoSocial());
		stmt.setDate(2, f.getdataCadastro()); 
		stmt.setString(3, f.getenderecoFornecedor());
		stmt.setInt(4, f.gettelFornecedor());
		stmt.setInt(5, f.getcelFornecedor());
		stmt.setString(6, f.getemailFornecedor());
		stmt.setInt(7, f.getcnpj());
		stmt.setInt(8, f.getinscricaoEstadual());
		stmt.setString(9, f.getobsFornecedor());
		
	
		stmt.execute();        
		close();        
	}  
	
	public List<Fornecedor> findAll() throws Exception{  
		open();  
		statement = con.createStatement();
		
		String sql = "SELECT Razao_Social, Data_Cadastro, End_Fornecedor, Tel_Fornecedor, Cel_Fornecedor, Email_Fornecedor, CNPJ, Inscr_Estadual, Obs_Fornecedor  FROM tb_fornecedor";
		ResultSet rs = statement.executeQuery(sql);

		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		while(rs.next()){
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setrazaoSocial(rs.getString("Razao_Social"));
			fornecedor.setdataCadastro(rs.getDate("Data_Cadastro"));
			fornecedor.setenderecoFornecedor(rs.getString("End_Fornecedor"));
			fornecedor.settelFornecedor(rs.getInt("Tel_Fornecedor"));
			fornecedor.setcelFornecedor(rs.getInt("Cel_Fornecedor"));
			fornecedor.setemailFornecedor(rs.getString("Email_Fornecedor"));
			fornecedor.setcnpj(rs.getInt("CNPJ"));
			fornecedor.setinscricaoEstadual(rs.getInt("Inscr_Estadual"));
			fornecedor.setobsFornecedor(rs.getString("Obs_Fornecedor"));
			
			lista.add(fornecedor);
		}
		rs.close();
		close(); 
		return lista;
	}
}
