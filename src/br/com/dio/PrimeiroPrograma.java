package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		/*int a = 2;
		int b = 3; 
		System.out.println("Helo Wolrd" + (a+b));
		 	*/
		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(livros);
		System.out.println(gato);
	}
}
class Livros{
	private String	nome;
	private String npag;
}
	


