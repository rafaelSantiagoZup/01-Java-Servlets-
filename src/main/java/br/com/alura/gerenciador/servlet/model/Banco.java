package br.com.alura.gerenciador.servlet.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> banco = new ArrayList<Empresa>();
	
	public void adicionaEmpresa(Empresa emp) {
		banco.add(emp);
		System.out.println("empresa "+emp.getNome()+" "+emp.getId()+" "+"adicionada com sucesso");
	}
	public List<Empresa> retornaEmpresas() {
		return this.banco;
	}
}
