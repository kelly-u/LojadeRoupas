package ifpe.padroes.projeto.pessoa;

public abstract class Pessoa {
	
	private Strategy strategy;
	public Strategy loginPessoa;
	private String cpf;
	private String nome;
	private String telefone;
	private String endereco;
	
	public abstract Strategy createStrategy();
	
	public void tipoLogin() {
		this.strategy = createStrategy();
		strategy.tipoLogin();
	}
	
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

	
	
	
}
