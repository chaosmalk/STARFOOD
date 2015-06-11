package br.com.starfood.persistence;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.startfood.entidade.FormaPagamento;


public class PagamentoDao extends Dao {  
	public void create(FormaPagamento f)throws Exception{  
		open();  

		stmt = con.prepareStatement("INSERT INTO tb_form_pag(Descricao, Taxa) VALUES(?,?)");  

		stmt.setString(1, f.getdescricao());
		stmt.setInt(2, f.gettaxa());  
	
		stmt.execute();        
		close();        
	} 
	
	public List<FormaPagamento> findAll() throws Exception{  
		open();  
		statement = con.createStatement();
		
		String sql = "SELECT Descricao, Taxa FROM tb_form_pag";
		ResultSet rs = statement.executeQuery(sql);

		List<FormaPagamento> lista = new ArrayList<FormaPagamento>();
		while(rs.next()){
			FormaPagamento pagamento = new FormaPagamento();
			pagamento.setdescricao(rs.getString("Descricao"));
			pagamento.settaxa(rs.getInt("Taxa"));
			
			
			lista.add(pagamento);
		}
		rs.close();
		close(); 
		return lista;
	}
}
