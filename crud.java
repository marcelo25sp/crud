package cursoJava;

import java.util.Scanner;

public class crud {

	public static void main(String[] args) {
		// Primeiros códigos de um CRUD 
		
		System.out.println("Bem vindo ao Projeto CRUD");
		System.out.println("Digite o nome do usuário:");
		Scanner teclado = new Scanner(System.in);
		String nome;
		nome = teclado.next();
		System.out.println("Bem vindo(a) " + nome);

	}

}
