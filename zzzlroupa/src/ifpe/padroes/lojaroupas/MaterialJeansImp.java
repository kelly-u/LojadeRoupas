package ifpe.padroes.lojaroupas;

public class MaterialJeansImp extends MaterialImp {

	@Override
	public String materialRoupaImp(String m) {
		m = "JEANS";
		System.out.println("Material jeans escolhido!");
		return m;
	}

}
