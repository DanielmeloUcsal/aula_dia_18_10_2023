package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pessoa;


@WebServlet("/DadosCalculados")
public class DadosCalculados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DadosCalculados() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {
			int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
			String aniversarioFeito = request.getParameter("fezAniversario");
			String nome = request.getParameter("nome");
			String endereco = request.getParameter("endereco");
			Pessoa pessoa = new Pessoa(anoNascimento, Pessoa.BarserBoolean(aniversarioFeito), nome, endereco);
			
			request.setAttribute("idade", pessoa.caulularIdade());
			request.setAttribute("nome", pessoa.getNome());
			request.setAttribute("endereco", pessoa.getEndereco());
			
		} catch (Exception e) {
			response.sendError(500);
		}
		
		response.getWriter().append("<h1> Idade:" + request.getAttribute("idade") + "</h1>");
		response.getWriter().append("<br>");
		response.getWriter().append("<h1> nome:" + request.getAttribute("nome") + "</h1>");
		response.getWriter().append("<br>");
		response.getWriter().append("<h1> endereco:" + request.getAttribute("endereco") + "</h1>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
