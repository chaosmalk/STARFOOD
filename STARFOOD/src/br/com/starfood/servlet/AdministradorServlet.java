package br.com.starfood.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.starfood.persistence.FuncionarioDao;
import br.com.startfood.entidade.Funcionario;

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
				
				dao.create(funcionario);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("adm/pag_adm.jsp");
		
		}else if(acao.equals("cadastrarCargo")){
			
			try {
				CargoDao dao = new CargoDao();
				Cargo cargo = new Cargo();
				
				cargo.setIdFuncao(Integer.parseInt(request.getParameter("idFuncao")));
				cargo.setDescricao(request.getParameter("descricao"));
				
				
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
				
				pagamento.setIdFormaPagamento(Integer.parseInt(request.getParameter("idFormaPagamento")));
				pagamento.setDescricao(request.getParameter("descricao"));
				pagamento.setIdFormaPagamento(Integer.parseInt(request.getParameter("taxa")));
				
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
				
				fornecedor.setIdFornecedor(Integer.parseInt(request.getParameter("idFornecedor")));
				fornecedor.setRazaoSocial(request.getParameter("razaoSocial"));
// não sei como colocar data	fornecedor.setIdFormaPagamento(Integer.parseInt(request.getParameter("dataCadastro")));
				fornecedor.setEndereco(request.getParameter("endereco"));
				fornecedor.setTelFornecedor(Integer.parseInt(request.getParameter("telefone")));
				fornecedor.setCelFornecedor(Integer.parseInt(request.getParameter("celular")));
				fornecedor.setEmailFoenecedor(request.getParameter("email"));
				fornecedor.setCnpj(Integer.parseInt(request.getParameter("cnpj")));
				fornecedor.setInscricaoEstadual(Integer.parseInt(request.getParameter("inscricaoEstadual")));
				fornecedor.setObservacoes(request.getParameter("observacoes"));
				
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
				
				produto.setIdProduto(Integer.parseInt(request.getParameter("idProduto")));
				produto.setDescProduto(request.getParameter("descProduto"));
				produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
				produto.setVolumetria(Integer.parseInt(request.getParameter("volumetria")));
				produto.setIdFornecedor(Integer.parseInt(request.getParameter("idFornecedor")));
				produto.setValorCompra(Integer.parseInt(request.getParameter("valorCompra")));
				produto.setValorCompra(Integer.parseInt(request.getParameter("valorVenda")));
				produto.setBarraProduto(Integer.parseInt(request.getParameter("barraProduto")));
				produto.setBarraInterna(Integer.parseInt(request.getParameter("barraInterna")));
				
				
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
					
					mesa.setIdMesa(Integer.parseInt(request.getParameter("idMesa")));
					mesa.setDescricao(request.getParameter("descricao"));
					mesa.setStatus(request.getParameter("status"));
										
					
					dao.create(mesa);
				} catch (Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect("adm/pag_adm.jsp");
			}
		}
	}

}
