package ifpe.padroes.lojaroupas;

public class MaterialMalha extends MaterialImp {

	@Override
	public String materialRoupaImp(String m) {
		m = "MALHA";
		System.out.println("Material malha escolhida!");
		return m;
	}
	
}
