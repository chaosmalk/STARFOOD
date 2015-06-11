package br.com.starfood.persistence;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.startfood.entidade.Produto;

public class ProdutoDao extends Dao {  
	public void create(Produto f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_produtos(Descri_Produto, Qtd_Produto, Id_Fornecedor, Dt_Compra, Dt_Validade, Val_Compra, Val_Venda) VALUES(?,?,?,?,?,?,?)");  

		stmt.setString(1, f.getdescProduto());
		stmt.setInt(2, f.getqtdProduto());  
		stmt.setInt(3, f.getidFornecedor());  
		stmt.setDate(4, f.getdataCompra());  
		stmt.setDate(5, f.getdataValidade());  
		stmt.setInt(6, f.getvalorCompra());  
		stmt.setInt(7, f.getvalorVenda());  
		

		stmt.execute();        
		close();        
	}   
	
	public List<Produto> findAll() throws Exception{  
		open();  
		statement = con.createStatement();
		
		String sql = "SELECT Descri_Produto, Qtd_Produto, Id_Fornecedor, Dt_Compra, Dt_Validade, Val_Compra, Val_Venda FROM tb_produtos";
		ResultSet rs = statement.executeQuery(sql);

		List<Produto> lista = new ArrayList<Produto>();
		while(rs.next()){
			Produto produto = new Produto();
			produto.setdescProduto(rs.getString("Descri_Produto"));
			produto.setqtdProduto(rs.getInt("Qtd_Produto"));
			produto.setidFornecedor(rs.getInt("Id_Fornecedor"));
			produto.setdataCompra(rs.getDate("Dt_Compra"));
			produto.setdataValidade(rs.getDate("Dt_Validade"));
			produto.setvalorCompra(rs.getInt("Val_Compra"));
			produto.setvalorVenda(rs.getInt("Val_Venda"));
			
			lista.add(produto);
		}
		rs.close();
		close(); 
		return lista;
	}
}
