package ifpe.padroes.lojaroupas;

public class CorAzulImp extends CorImp {

	@Override
	public String corRoupaImp(String c) {
		c = "AZUL";
		System.out.println("Cor azul escolhida!");
		return c;
	}

}
