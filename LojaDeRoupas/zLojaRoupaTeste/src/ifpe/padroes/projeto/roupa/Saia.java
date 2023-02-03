package ifpe.padroes.projeto.roupa;

public class Saia extends Roupa 
{
	
	@Override
	public Strategy createStrategy() {
		return new SaiaStrategy();
	}

}
