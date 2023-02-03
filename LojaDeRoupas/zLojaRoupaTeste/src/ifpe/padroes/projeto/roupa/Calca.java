package ifpe.padroes.projeto.roupa;

public class Calca extends Roupa {

	@Override
	public Strategy createStrategy() {
		return new CalcaStrategy();
	}

}
