package br.com.starfood.persistence;

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
}
