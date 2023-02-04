package ifpe.padroes.projeto.roupa;

public abstract class Roupa {

	private Strategy strategy;
	private String codigo;
	private String nome;
	private String marca;
	private int valor;	
	
	public abstract Strategy createStrategy();
	
	public void escolherRoupa() {
		this.strategy = createStrategy();
		strategy.escRoupa();
	}
	
	
	
	
	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}
