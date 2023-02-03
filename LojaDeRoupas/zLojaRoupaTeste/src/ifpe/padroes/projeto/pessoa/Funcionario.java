package ifpe.padroes.projeto.pessoa;

public class Funcionario extends Pessoa {

	@Override
	public Strategy createStrategy() {
		return new FuncionarioStrategy();	
	}

}
