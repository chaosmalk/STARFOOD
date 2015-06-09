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
			
		}
	}

}
