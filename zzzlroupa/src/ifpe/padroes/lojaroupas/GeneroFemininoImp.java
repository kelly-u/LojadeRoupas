package ifpe.padroes.lojaroupas;

public class GeneroFemininoImp extends GeneroImp {

	@Override
	public String generoRoupaImp(String g) {
		g = "FEMININO";
		System.out.println("G�nero feminino escolhido!");
		return g;
	}

}
