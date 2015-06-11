package br.com.starfood.persistence;

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
}
