package ifpe.padroes.projeto.pessoa;

import java.util.Scanner;

public class ClienteStrategy extends Strategy {

	@Override
	public void tipoLogin() {
		
		Pessoa cliente = new Cliente();
		
		System.out.println("Bem-vindo, cliente!");
		
		/******************************************************/
		
		System.out.println("Digite seu cpf:");
		cliente.setCpf(new Scanner(System.in).nextLine());
		
		/******************************************************/
		
		System.out.println("Digite seu nome:");
		cliente.setNome(new Scanner(System.in).nextLine());

		/******************************************************/
		
		System.out.println("Digite seu telefone:");
		cliente.setTelefone(new Scanner(System.in).nextLine());
		
		/******************************************************/
		
		System.out.println("Digite seu endereco:");
		cliente.setEndereco(new Scanner(System.in).nextLine());
		
		/******************************************************/	
		
		
	}

}
