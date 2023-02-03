package ifpe.padroes.projeto.pessoa;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Pessoa func = new Funcionario();
		Pessoa cliente = new Cliente();
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite 1 para funcionário e 2 para cliente:");
			int login = teclado.nextInt();
			
			if(login == 1) {
				func.tipoLogin();
			} else {
				cliente.tipoLogin();
			}
		}
		System.out.println("Fim da escolha das roupas");
		
		
		
	}

}


































