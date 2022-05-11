package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato Gato = new Gato();
		livros livros = new livros();
		System.out.println(Gato);
		System.out.println(livros);
		/*
		 * int a = 12; int b = 3; System.out.println(" Hello seus panacas! " + (a * b));
		 */

	}

}

class livros {
	String nome;
	String npag;
}
