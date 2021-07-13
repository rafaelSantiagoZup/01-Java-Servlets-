package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.alura.gerenciador.servlet.model.Banco;
import br.com.alura.gerenciador.servlet.model.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa(nomeEmpresa);
		Banco banco = new Banco();
		banco.adicionaEmpresa(empresa);
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresa.jsp");
		request.setAttribute("empresa", empresa.getNome() );
		rd.forward(request, response);
	}

}
