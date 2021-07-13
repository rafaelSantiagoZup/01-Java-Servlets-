package br.com.alura.gerenciador.servlet.model;

public class Empresa {
	
	private static Integer id = 0;
	private String nome;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Empresa(String nome) {
		this.nome = nome;
		this.id++;
	}
	

}
