package ifpe.padroes.lojaroupas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RoupaAbstracao blusa = new Blusa();
		RoupaAbstracao calca = new Calca();
		RoupaAbstracao saia = new Saia();

/*		CALCA
		//Mundando a cor
		calca.setImpC(new CorAmareloImp());
		//Mostrando a cor
		calca.corRoupa();
		
		//Mundando o material
		calca.setImpM(new MaterialLinhoImp());
		//Mostrando o material
		calca.materialRoupa();
*/	
/* SAIA
		//Mudando o gênero
		saia.setImpG(new GeneroFemininoImp());
		//Mostrando o gênero
		saia.generoRoupa();
*/
/* BLUSA
		//Mundando a cor
		blusa.setImpE(new EstampaLisaImp());
		//Mostrando a cor
		blusa.estampaRoupa();
				
		//Mundando o material
		blusa.setImpT(new TamanhoPImp());
		//Mostrando o material
		blusa.tamanhoRoupa();
*/
		
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
