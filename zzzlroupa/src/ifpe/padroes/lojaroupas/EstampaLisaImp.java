package ifpe.padroes.lojaroupas;

public class EstampaLisaImp extends EstampaImp {

	@Override
	public String estampaRoupaImp(String e) {
		e = "LISA";
		System.out.println("Estampa lisa escolhida!");
		return e;
	}

}
