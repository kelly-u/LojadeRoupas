package ifpe.padroes.projeto.pessoa;

import java.util.Scanner;

public class FuncionarioStrategy extends Strategy {
	
	public void tipoLogin() {
		
		Pessoa func = new Funcionario();
		
		System.out.println("Bem-vindo, funcionário!");
		
		/******************************************************/
		
		System.out.println("Digite seu cpf:");
		func.setCpf(new Scanner(System.in).nextLine());
		
		/******************************************************/
		
		System.out.println("Digite seu nome:");
		func.setNome(new Scanner(System.in).nextLine());

		/******************************************************/
		
		System.out.println("Digite seu telefone:");
		func.setTelefone(new Scanner(System.in).nextLine());
		
		/******************************************************/
		
		System.out.println("Digite seu endereco:");
		func.setEndereco(new Scanner(System.in).nextLine());
		
		/******************************************************/	

		
	}
}
