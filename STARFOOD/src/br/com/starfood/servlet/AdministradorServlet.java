package br.com.starfood.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.starfood.persistence.CargoDao;
import br.com.starfood.persistence.FuncionarioDao;
import br.com.starfood.persistence.PagamentoDao;
import br.com.startfood.entidade.Fornecedor;
import br.com.startfood.entidade.Funcionario;
import br.com.startfood.entidade.Produto;

/**
 * Servlet implementation class AdministradorServlet
 */
@WebServlet("/Administrador")
public class AdministradorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministradorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
		if(acao.equals("cadastrarFuncionario")){
			try {
				FuncionarioDao dao = new FuncionarioDao();
				Funcionario funcionario = new Funcionario();
				
				funcionario.setNomeFuncionario(request.getParameter("nomeFuncionario"));
				funcionario.setcpf(Integer.parseInt(request.getParameter("cpf")));
				funcionario.setEmailFuncionario(request.getParameter("email"));
				funcionario.setEnderecoFuncionario(request.getParameter("endereco"));
				funcionario.setTelFuncionario(Integer.parseInt(request.getParameter("telefone")));
				funcionario.setcelFuncionario(Integer.parseInt(request.getParameter("celular")));
				funcionario.setrg(Integer.parseInt(request.getParameter("rg")));
				funcionario.setpassword(request.getParameter("password"));
				java.sql.Date dataAdmissao = new java.sql.Date(format.parse(request.getParameter("dataAdmissao")).getTime());
				funcionario.setdataEntrada(dataAdmissao);
				
				dao.create(funcionario);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("adm/pag_adm.jsp");
		
		}else if(acao.equals("cadastrarCargo")){
			
			try {
				CargoDao dao = new CargoDao();
				Cargo cargo = new Cargo();
				
				cargo.setdescricao(request.getParameter("descricao"));
				
				
				dao.create(cargo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("adm/pag_adm.jsp");
		}
		
		else if(acao.equals("cadastrarFormaPagamento")){
			
			try {
				PagamentoDao dao = new PagamentoDao();
				Pagamento pagamento = new Pagamento();
				
				pagamento.setdescricao(request.getParameter("descricao"));
				pagamento.settaxa(Integer.parseInt(request.getParameter("taxa")));
				
				dao.create(pagamento);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("adm/pag_adm.jsp");
		}
		
		else if(acao.equals("cadastrarFornecedor")){
			
			try {
				FornecedorDao dao = new FornecedorDao();
				Fornecedor fornecedor = new Fornecedor();
				
				fornecedor.setrazaoSocial(request.getParameter("razaoSocial"));
				java.sql.Date dataCadastro = new java.sql.Date(format.parse(request.getParameter("dataCadastro")).getTime());
				fornecedor.setdataCadastro(dataCadastro);
				fornecedor.setendereco(request.getParameter("endereco"));
				fornecedor.settelefone(Integer.parseInt(request.getParameter("telefone")));
				fornecedor.setcelular(Integer.parseInt(request.getParameter("celular")));
				fornecedor.setemail(request.getParameter("email"));
				fornecedor.setcnpj(Integer.parseInt(request.getParameter("cnpj")));
				fornecedor.setinscricaoEstadual(Integer.parseInt(request.getParameter("inscricaoEstadual")));
				fornecedor.setobservacoes(request.getParameter("observacoes"));
				
				dao.create(fornecedor);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("adm/pag_adm.jsp");
		}
			
			else if(acao.equals("cadastrarProduto")){
			
			try {
				ProdutoDao dao = new ProdutoDao();
				Produto produto = new Produto();
				
				produto.setdescProduto(request.getParameter("descProduto"));
				produto.setquantidade(Integer.parseInt(request.getParameter("quantidade")));
				produto.setvolumetria(Integer.parseInt(request.getParameter("volumetria")));
				produto.setidFornecedor(Integer.parseInt(request.getParameter("idFornecedor")));
				produto.setvalorCompra(Integer.parseInt(request.getParameter("valorCompra")));
				produto.setvalorVenda(Integer.parseInt(request.getParameter("valorVenda")));
				produto.setbarraProduto(Integer.parseInt(request.getParameter("barraProduto")));
				produto.setbarraInterna(Integer.parseInt(request.getParameter("barraInterna")));
				
				
				dao.create(produto);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("adm/pag_adm.jsp");
		}
		
			else if(acao.equals("cadastrarMesa")){
				
				try {
					MesaDao dao = new MesaDao();
					Mesa mesa = new Mesa();
					
					mesa.setdescricao(request.getParameter("descricao"));
					mesa.setstatus(request.getParameter("status"));
										
					
					dao.create(mesa);
				} catch (Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect("adm/pag_adm.jsp");
			}
		}
	}

}
