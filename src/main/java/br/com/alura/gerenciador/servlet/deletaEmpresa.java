package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import br.com.alura.gerenciador.servlet.model.Banco;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class deletaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		banco.removeEmpresa(id);
		System.out.println("Id "+id);
		System.out.println("Tamanho do banco "+banco.retornaEmpresas().size());
		response.sendRedirect("getListaEmpresas");
	}

}
