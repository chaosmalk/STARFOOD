package br.com.starfood.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PedidoServlet
 */
@WebServlet("/Atendimento")
public class AtendimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtendimentoServlet() {
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
		
		if(acao.equals("abrirPedido")){
			System.out.println(request.getParameter("optionsRadiosInline"));
			System.out.println(request.getParameter("acao"));
			
			try {
//				FuncionarioDao dao = new FuncionarioDao();
//				Funcionario funcionario = new Funcionario();
//				
//				funcionario.setId(1);
//				funcionario.setNomeFuncionario("Teste");
//				
//				dao.create(funcionario);
			} catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("atendimento/fazerPedido.jsp");
		}
	}

}
