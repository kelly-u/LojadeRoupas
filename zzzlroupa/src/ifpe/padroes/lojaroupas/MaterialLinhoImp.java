package ifpe.padroes.lojaroupas;

public class MaterialLinhoImp extends MaterialImp {

	@Override
	public String materialRoupaImp(String m) {
		m = "LINHO";
		System.out.println("Material linho escolhido!");
		return m;
	}

}
