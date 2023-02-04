package ifpe.padroes.projeto.roupa;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Roupa blusa = new Blusa();
		Roupa calca = new Calca();
		Roupa saia = new Saia();
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Qual roupa você quer escolher?");
			System.out.println("Digite 1 - SAIA, 2 - BLUSA, 3 - CALÇA:");
			int r = teclado.nextInt();
			
			if(r == 1) {
				saia.escolherRoupa();

			} else if (r == 2){
				blusa.escolherRoupa();
				
			} else if (r == 3) {
				calca.escolherRoupa();
				
			} else {
				System.out.println("OPÇÃO INVÁLIDA");
			}
		}
		
		System.out.println("Fim da escolha das roupas");
	}

}
