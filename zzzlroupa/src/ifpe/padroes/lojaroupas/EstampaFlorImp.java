package ifpe.padroes.lojaroupas;

public class EstampaFlorImp extends EstampaImp {

	@Override
	public String estampaRoupaImp(String e) {
		e = "FLOR";
		System.out.println("Estampa flor escolhida!");
		return e;
	}

}
