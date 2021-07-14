package br.com.alura.gerenciador.servlet.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> banco = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	public void adicionaEmpresa(Empresa emp) {
		emp.setId(Banco.chaveSequencial++);
		banco.add(emp);
	}
	public List<Empresa> retornaEmpresas() {
		return this.banco;
	}
	public void editaEmpresa(Integer id,String nome,Date data) {
		Iterator<Empresa> it = banco.iterator();
		while(it.hasNext()){
			Empresa empres = it.next();
			if(empres.getId() == id) {
				empres.setNome(nome);
				empres.setDataAbertura(data);
			}
		}
	}
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = banco.iterator();
		while(it.hasNext()){
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}
	public Empresa buscaEmpresaById(Integer id) {
		for(Empresa empresa:banco) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
		
	}
}
