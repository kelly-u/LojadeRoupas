package ifpe.padroes.projeto.pessoa;

public class Cliente extends Pessoa {

	@Override
	public Strategy createStrategy() {
		return new ClienteStrategy();
	}

}
