package com.github.CaioWatzko.estudosJava;

public class Programa {
	public static void main(String[] args) throws Exception{
		Curso curso = new Curso();
		curso.setNome("Programação I");
		curso.setProfessor("Maycon");
		curso.setTema("Java");
		curso.setValor(450d);
		
		System.out.println(String.format("Nome do curso: %s \n" +
										 "Nome do professor: %s \n" +
										 "Tema do curso: %s \n" +
										 "Valor do curso: R$%f \n", curso.getNome(), curso.getProfessor(), curso.getTema(), curso.getValor()
										 ));

	}

}