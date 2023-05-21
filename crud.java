package javaCurso;

import java.util.Scanner;

public class Crud {

	public static void main(String[] args) {
		
		
		System.out.println("Bem vindo ao Projeto CRUD");
		System.out.println("Digite o nome do usuário:");
		Scanner teclado = new Scanner(System.in);
		String nome;
		nome = teclado.next();
		System.out.println("Bem vindo(a)!! " + nome);
		
		System.out.println("---------------------------");
		System.out.println("DIGITE A OPERAÇÃO DESEJADA:");
		System.out.println("---------------------------");
		System.out.println("1- Registar!!");
		System.out.println("2- Listar");
		System.out.println("3- Atualizar");
		System.out.println("4- Deletar");
		System.out.println("5- Remuneração Total");
		System.out.println("6- Sair");
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		opcao = sc.nextInt();
		
		
		
		
		
		
		

		
	}

}
