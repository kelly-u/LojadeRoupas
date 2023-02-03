package ifpe.padroes.projeto.roupa;

public class Main {
	
	public static void main(String[] args) {
		Roupa blusa = new Blusa();
		Roupa calca = new Calca();
		Roupa saia = new Saia();
		
		blusa.escolherRoupa();
		calca.escolherRoupa();
		saia.escolherRoupa();

		System.out.println("Fim da escolha das roupas");
	}

}
