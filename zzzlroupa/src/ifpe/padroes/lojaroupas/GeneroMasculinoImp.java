package ifpe.padroes.lojaroupas;

public class GeneroMasculinoImp extends GeneroImp {

	@Override
	public String generoRoupaImp(String g) {
		g = "MASCULINO";
		System.out.println("G�nero masculino escolhido!");
		return g;
	}

}
