package com.github.CaioWatzko.estudosJava;

public class Curso {

	private String nome;
	private String professor;
	private String tema;
	private Double valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) throws Exception{
		if (valor <= 0d || valor > 1000d) {
			this.valor = valor;
		} else {
			throw new Exception("Valor deve ser maior que R$0,00 e menor que R$1000,00");
		}
	}

	
}