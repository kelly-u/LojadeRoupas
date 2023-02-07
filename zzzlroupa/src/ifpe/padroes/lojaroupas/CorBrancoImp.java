package ifpe.padroes.lojaroupas;

public class CorBrancoImp extends CorImp {

	@Override
	public String corRoupaImp(String c) {
		c = "BRANCO";
		System.out.println("Cor branca escolhida!");
		return c;
	}

}
