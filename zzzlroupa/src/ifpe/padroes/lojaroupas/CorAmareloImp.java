package ifpe.padroes.lojaroupas;

public class CorAmareloImp extends CorImp {

	@Override
	public String corRoupaImp(String c) {
		c = "AMARELO";
		System.out.println("Cor amarelo escolhida!");
		return c;
	}

}
