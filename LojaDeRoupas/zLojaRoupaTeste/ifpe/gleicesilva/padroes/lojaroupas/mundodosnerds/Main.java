package ifpe.gleicesilva.padroes.lojaroupas.mundodosnerds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("***************************************************");
		System.out.println("");
		System.out.println("BEM-VINDO(A) À LOJA DE ROUPAS *MUNDO DOS NERDS* !!!");
		System.out.println("");
		System.out.println("***************************************************");		
		
		System.out.println("");
		System.out.println("");
		
		
		/***********************************************************
		TIPOS
		***********************************************************/
		
		System.out.println("");
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Qual roupa você quer escolher?");
			System.out.println("Digite 1 - SAIA:, 2 - CALCA, 3 - BLUSA: ");
			int r = teclado.nextInt();

			if (r == 1) {
				
				/***********************************************************
				 ***********************************************************
				SAIA
				***********************************************************
				***********************************************************/
				
				RoupaAbstracao saia = new Saia();
				saia.escolherRoupa();
				saia.setTipoRoupa("saia");
				saia.setImpC(new CoresImp());
				saia.setImpG(new GenerosImp());
				saia.setImpT(new TamanhosImp());
				saia.setImpE(new EstampasImp());
				saia.setImpM(new MateriaisImp());

				/***********************************************************
				GÊNEROS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O GÊNERO:");
				System.out.println("1 - FEMININO:");
				Scanner teclado2 = new Scanner(System.in);
				int r2 = teclado2.nextInt();
				
				switch (r2) {
				case 1:
					saia.setTipoGenero("feminino");
					saia.escolherGeneroFeminino();
					break;

				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				
				/***********************************************************
				TAMANHOS
				***********************************************************/
				System.out.println("");
				System.out.println("ESCOLHA O TAMANHO:");
				System.out.println("1 - P, 2 - M, 3 - G:");
				Scanner teclado3 = new Scanner(System.in);
				int r3 = teclado3.nextInt();
				
				switch (r3) {
				case 1:
					saia.setTipoTamanho("P");
					saia.escolherTamanhoP();
					break;

				case 2:
					saia.setTipoTamanho("M");
					saia.escolherTamanhoM();
					break;
					
				case 3:
					saia.setTipoTamanho("G");
					saia.escolherTamanhoG();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				System.out.println("");
				/***********************************************************
				CORES
				***********************************************************/
				
				System.out.println("ESCOLHA A COR:");
				System.out.println("1 - AMARELO, 2 - AZUL, 3 - BRANCO:");
				Scanner teclado4 = new Scanner(System.in);
				int r4 = teclado4.nextInt();

				switch (r4) {
				case 1:
					saia.setTipoCor("amarelo");
					saia.escolherCorAmarelo();
					break;

				case 2:
					saia.setTipoCor("azul");
					saia.escolherCorAzul();
					break;

				case 3:
					saia.setTipoCor("branco");
					saia.escolherCorBranco();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				ESTAMPAS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA A ESTAMPA:");
				System.out.println("1 - BOLA, 2 - FLOR, 3 - LISA:");
				Scanner teclado5 = new Scanner(System.in);
				int r5 = teclado5.nextInt();

				switch (r5) {
				case 1:
					saia.setTipoEstampa("bola");
					saia.escolherEstampaBola();
					break;

				case 2:
					saia.setTipoEstampa("flor");
					saia.escolherEstampaFlor();
					break;

				case 3:
					saia.setTipoEstampa("lisa");
					saia.escolherEstampaLisa();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				ESTAMPAS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O MATERIAL:");
				System.out.println("1 - JEANS, 2 - LINHO, 3 - MALHA:");
				Scanner teclado6 = new Scanner(System.in);
				int r6 = teclado6.nextInt();

				switch (r6) {
				case 1:
					saia.setTipoMaterial("jeans");
					saia.escolhermaterialJeans();
					break;

				case 2:
					saia.setTipoMaterial("linho");
					saia.escolherMaterialLinho();
					break;

				case 3:
					saia.setTipoMaterial("malha");
					saia.escolherMaterialMalha();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				System.out.println("");
				System.out.println("");
				System.out.println("Sua roupa do tipo " + saia.getTipoRoupa()
				+ ", do genero " + saia.getTipoGenero() + ", com tamanho " + saia.getTipoTamanho() + ", com a cor "
				+ saia.getTipoCor() + ", estampa " + saia.getTipoEstampa() + " e fabricada com o material "
				+ saia.getTipoMaterial() + " foi encomendada COM SUCESSO!");
				
				
				
				
				
				
			} else if (r == 2) {
				
				/***********************************************************
				 ***********************************************************
				CALCA
				***********************************************************
				***********************************************************/
				
				RoupaAbstracao calca = new Calca();
				calca.escolherRoupa();
				calca.setTipoRoupa("calça");
				calca.setImpC(new CoresImp());
				calca.setImpG(new GenerosImp());
				calca.setImpT(new TamanhosImp());
				calca.setImpE(new EstampasImp());
				calca.setImpM(new MateriaisImp());

				/***********************************************************
				GÊNEROS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O GÊNERO:");
				System.out.println("1 - MASCULINO, 2 - FEMININO:");
				Scanner teclado2 = new Scanner(System.in);
				int r2 = teclado2.nextInt();
				
				switch (r2) {
				case 1:
					calca.setTipoGenero("masculino");
					calca.escolherGeneroMasculino();
					break;

				case 2:
					calca.setTipoGenero("feminino");
					calca.escolherGeneroFeminino();
					break;
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				
				/***********************************************************
				TAMANHOS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O TAMANHO:");
				System.out.println("1 - P, 2 - M, 3 - G:");
				Scanner teclado3 = new Scanner(System.in);
				int r3 = teclado3.nextInt();
				
				switch (r3) {
				case 1:
					calca.setTipoTamanho("P");
					calca.escolherTamanhoP();
					break;

				case 2:
					calca.setTipoTamanho("M");
					calca.escolherTamanhoM();
					break;
					
				case 3:
					calca.setTipoTamanho("G");
					calca.escolherTamanhoG();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				CORES
				***********************************************************/
				
				System.out.println("");
				System.out.println("");
				System.out.println("ESCOLHA A COR:");
				System.out.println("1 - AMARELO, 2 - AZUL, 3 - BRANCO:");
				Scanner teclado4 = new Scanner(System.in);
				int r4 = teclado4.nextInt();

				switch (r4) {
				case 1:
					calca.setTipoCor("amarelo");
					calca.escolherCorAmarelo();
					break;

				case 2:
					calca.setTipoCor("azul");
					calca.escolherCorAzul();
					break;

				case 3:
					calca.setTipoCor("branco");
					calca.escolherCorBranco();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				ESTAMPAS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA A ESTAMPA:");
				System.out.println("1 - BOLA, 2 - FLOR, 3 - LISA:");
				Scanner teclado5 = new Scanner(System.in);
				int r5 = teclado5.nextInt();

				switch (r5) {
				case 1:
					calca.setTipoEstampa("bola");
					calca.escolherEstampaBola();
					break;

				case 2:
					calca.setTipoEstampa("flor");
					calca.escolherEstampaFlor();
					break;

				case 3:
					calca.setTipoEstampa("lisa");
					calca.escolherEstampaLisa();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				ESTAMPAS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O MATERIAL:");
				System.out.println("1 - JEANS, 2 - LINHO, 3 - MALHA:");
				Scanner teclado6 = new Scanner(System.in);
				int r6 = teclado6.nextInt();

				switch (r6) {
				case 1:
					calca.setTipoMaterial("jeans");
					calca.escolhermaterialJeans();
					break;

				case 2:
					calca.setTipoMaterial("linho");
					calca.escolherMaterialLinho();
					break;

				case 3:
					calca.setTipoMaterial("malha");
					calca.escolherMaterialMalha();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				System.out.println("");
				System.out.println("");
				System.out.println("Sua roupa do tipo " + calca.getTipoRoupa()
				+ ", do genero " + calca.getTipoGenero() + ", com tamanho " + calca.getTipoTamanho() + ", com a cor "
				+ calca.getTipoCor() + ", estampa " + calca.getTipoEstampa() + " e fabricada com o material "
				+ calca.getTipoMaterial() + " foi encomendada COM SUCESSO!");
				
				
				
				
				
				
			} else if (r == 3) {
				
				/***********************************************************
				 ***********************************************************
				BLUSA
				***********************************************************
				***********************************************************/
				
				RoupaAbstracao blusa = new Blusa();
				blusa.escolherRoupa();
				blusa.setTipoRoupa("blusa");
				blusa.setImpC(new CoresImp());
				blusa.setImpG(new GenerosImp());
				blusa.setImpT(new TamanhosImp());
				blusa.setImpE(new EstampasImp());
				blusa.setImpM(new MateriaisImp());

				/***********************************************************
				GÊNEROS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O GÊNERO:");
				System.out.println("1 - MASCULINO, 2 - FEMININO:");
				Scanner teclado2 = new Scanner(System.in);
				int r2 = teclado2.nextInt();
				
				switch (r2) {
				case 1:
					blusa.setTipoGenero("masculino");
					blusa.escolherGeneroMasculino();
					break;

				case 2:
					blusa.setTipoGenero("feminino");
					blusa.escolherGeneroFeminino();
					break;
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				
				/***********************************************************
				TAMANHOS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O TAMANHO:");
				System.out.println("1 - P, 2 - M, 3 - G:");
				Scanner teclado3 = new Scanner(System.in);
				int r3 = teclado3.nextInt();
				
				switch (r3) {
				case 1:
					blusa.setTipoTamanho("P");
					blusa.escolherTamanhoP();
					break;

				case 2:
					blusa.setTipoTamanho("M");
					blusa.escolherTamanhoM();
					break;
					
				case 3:
					blusa.setTipoTamanho("G");
					blusa.escolherTamanhoG();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				CORES
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA A COR:");
				System.out.println("1 - AMARELO, 2 - AZUL, 3 - BRANCO:");
				Scanner teclado4 = new Scanner(System.in);
				int r4 = teclado4.nextInt();

				switch (r4) {
				case 1:
					blusa.setTipoCor("amarelo");
					blusa.escolherCorAmarelo();
					break;

				case 2:
					blusa.setTipoCor("azul");
					blusa.escolherCorAzul();
					break;

				case 3:
					blusa.setTipoCor("branco");
					blusa.escolherCorBranco();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				ESTAMPAS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA A ESTAMPA:");
				System.out.println("1 - BOLA, 2 - FLOR, 3 - LISA:");
				Scanner teclado5 = new Scanner(System.in);
				int r5 = teclado5.nextInt();

				switch (r5) {
				case 1:
					blusa.setTipoEstampa("bola");
					blusa.escolherEstampaBola();
					break;

				case 2:
					blusa.setTipoEstampa("flor");
					blusa.escolherEstampaFlor();
					break;

				case 3:
					blusa.setTipoEstampa("lisa");
					blusa.escolherEstampaLisa();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				/***********************************************************
				ESTAMPAS
				***********************************************************/
				
				System.out.println("");
				System.out.println("ESCOLHA O MATERIAL:");
				System.out.println("1 - JEANS, 2 - LINHO, 3 - MALHA:");
				Scanner teclado6 = new Scanner(System.in);
				int r6 = teclado6.nextInt();

				switch (r6) {
				case 1:
					blusa.setTipoMaterial("jeans");;
					blusa.escolhermaterialJeans();
					break;

				case 2:
					blusa.setTipoMaterial("linho");
					blusa.escolherMaterialLinho();
					break;

				case 3:
					blusa.setTipoMaterial("malha");
					blusa.escolherMaterialMalha();
					break;
					
				default:
					System.out.println("OPÇÃO INVÁLIDA!");
					break;
				}
				
				System.out.println("");
				System.out.println("");
				System.out.println("A sua roupa do tipo " + blusa.getTipoRoupa()
				+ ", do genero " + blusa.getTipoGenero() + ", com tamanho " + blusa.getTipoTamanho() + ", com a cor "
				+ blusa.getTipoCor() + ", estampa " + blusa.getTipoEstampa() + " e fabricada com o material "
				+ blusa.getTipoMaterial() + " foi encomendada COM SUCESSO!");
				
				
				
				
			} else {
				System.out.println("OPÇÃO INVÁLIDA");
			}
		}
		System.out.println("");
		System.out.println("Obrigada pela compra e volte sempre!");
		

	}

}
