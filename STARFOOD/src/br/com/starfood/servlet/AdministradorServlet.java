package br.com.starfood.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.starfood.persistence.CargoDao;
import br.com.starfood.persistence.FornecedorDao;
import br.com.starfood.persistence.FuncionarioDao;
import br.com.starfood.persistence.MesaDao;
import br.com.starfood.persistence.PagamentoDao;
import br.com.starfood.persistence.ProdutoDao;
import br.com.startfood.entidade.FormaPagamento;
import br.com.startfood.entidade.Fornecedor;
import br.com.startfood.entidade.Funcao;
import br.com.startfood.entidade.Funcionario;
import br.com.startfood.entidade.Produto;
import br.com.startfood.entidade.Solicitante;

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
		String acao = request.getParameter("acao");
		
		if(acao.equals("visualizarFuncionarios")){
			
			FuncionarioDao dao = new FuncionarioDao();
			
			try {
				List<Funcionario> listFuncionarios = dao.findAll();
				request.setAttribute("listFuncionarios", listFuncionarios);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher view = request.getRequestDispatcher("formularios/listaFuncionario.jsp");  
		    view.forward(request, response); 
		}
		
		else if(acao.equals("visualizarProdutos")){
			
			ProdutoDao dao = new ProdutoDao();
			
			try {
				List<Produto> listProdutos = dao.findAll();
				request.setAttribute("listProdutos", listProdutos);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher view = request.getRequestDispatcher("formularios/listaProduto.jsp");  
		    view.forward(request, response); 
		}
		
			else if(acao.equals("visualizarFornecedores")){
			
			FornecedorDao dao = new FornecedorDao();
			
			try {
				List<Fornecedor> listFornecedores = dao.findAll();
				request.setAttribute("listFornecedores", listFornecedores);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher view = request.getRequestDispatcher("formularios/listaFornecedor.jsp");  
		    view.forward(request, response); 
		}
		
			else if(acao.equals("visualizarMesa")){
				
				MesaDao dao = new MesaDao();
				
				try {
					List<Solicitante> listSolicitantes = dao.findAll();
					request.setAttribute("listSolicitantes", listSolicitantes);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				RequestDispatcher view = request.getRequestDispatcher("formularios/listaSolicitante.jsp");  
			    view.forward(request, response); 
			}
		
			else if(acao.equals("visualizarFormaPagamentos")){
				
				PagamentoDao dao = new PagamentoDao();
				
				try {
					List<FormaPagamento> listPagamentos = dao.findAll();
					request.setAttribute("listPagamentos", listPagamentos);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				RequestDispatcher view = request.getRequestDispatcher("formularios/listaFormaPagamento.jsp");  
			    view.forward(request, response); 
			}
		
			else if(acao.equals("visualizarCargo")){
				
				CargoDao dao = new CargoDao();
				
				try {
					List<Funcao> listCargos = dao.findAll();
					request.setAttribute("listCargos", listCargos);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				RequestDispatcher view = request.getRequestDispatcher("formularios/listaFuncao.jsp");  
			    view.forward(request, response); 
			}
		
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
				Funcao cargo = new Funcao();
				
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
				FormaPagamento pagamento = new FormaPagamento();
				
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
				fornecedor.setenderecoFornecedor(request.getParameter("endereco"));
				fornecedor.settelFornecedor(Integer.parseInt(request.getParameter("telefone")));
				fornecedor.setcelFornecedor(Integer.parseInt(request.getParameter("celular")));
				fornecedor.setemailFornecedor(request.getParameter("email"));
				fornecedor.setcnpj(Integer.parseInt(request.getParameter("cnpj")));
				fornecedor.setinscricaoEstadual(Integer.parseInt(request.getParameter("inscricaoEstadual")));
				fornecedor.setobsFornecedor(request.getParameter("observacoes"));
				
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
				produto.setqtdProduto(Integer.parseInt(request.getParameter("quantidade")));
				produto.setidFornecedor(Integer.parseInt(request.getParameter("idFornecedor")));
				produto.setvalorCompra(Integer.parseInt(request.getParameter("valorCompra")));
				produto.setvalorVenda(Integer.parseInt(request.getParameter("valorVenda")));
				java.sql.Date dataCompra = new java.sql.Date(format.parse(request.getParameter("dataCompra")).getTime());
				produto.setdataCompra(dataCompra);
				java.sql.Date dataValidade = new java.sql.Date(format.parse(request.getParameter("dataValidade")).getTime());
				produto.setdataValidade(dataValidade);
				
				
				dao.create(produto);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("adm/pag_adm.jsp");
		}
		
			else if(acao.equals("cadastrarMesa")){
				
				try {
					MesaDao dao = new MesaDao();
					Solicitante mesa = new Solicitante();
					
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


