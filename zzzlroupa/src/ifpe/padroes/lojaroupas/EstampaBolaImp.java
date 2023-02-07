package ifpe.padroes.lojaroupas;

public class EstampaBolaImp extends EstampaImp {

	@Override
	public String estampaRoupaImp(String e) {
		e = "BOLA";
		System.out.println("Estampa bola escolhida!");
		return e;
	}

}
