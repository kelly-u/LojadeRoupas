package ifpe.padroes.projeto.roupa;

public class Blusa extends Roupa {

	@Override
	public Strategy createStrategy() {
		return new BlusaStrategy();
	}

}
