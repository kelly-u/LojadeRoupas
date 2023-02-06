package ifpe.padroes.lojaroupas;

public abstract class RoupaAbstracao {

	//Herança via atributo
	//A classe RoupaAbstracao tem as coisas de corImp pelo atributo imp
	private CorImp impC;
	private MaterialImp impM;
	private TamanhoImp impT;
	private EstampaImp impE;
	private GeneroImp impG;
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
	
	public void corRoupa(){
		getImpC().corRoupaImp();
	}
	
	public void materialRoupa() {
		getImpM().materialRoupaImp();	
	}
	
	public void tamanhoRoupa() {
		getImpT().tamanhoRoupaImp();	
	}
	
	public void estampaRoupa() {
		getImpE().estampaRoupaImp();	
	}
	
	public void generoRoupa() {
		getImpG().generoRoupaImp();	
	}
	
	
	/***********************************************************
	GETTERS E SETTERS
	***********************************************************/
	
	public CorImp getImpC() {
		return impC;
	}

	public void setImpC(CorImp impC) {
		this.impC = impC;
	}

	public MaterialImp getImpM() {
		return impM;
	}

	public void setImpM(MaterialImp impM) {
		this.impM = impM;
	}

	public TamanhoImp getImpT() {
		return impT;
	}

	public void setImpT(TamanhoImp impT) {
		this.impT = impT;
	}

	public EstampaImp getImpE() {
		return impE;
	}

	public void setImpE(EstampaImp impE) {
		this.impE = impE;
	}

	public GeneroImp getImpG() {
		return impG;
	}

	public void setImpG(GeneroImp impG) {
		this.impG = impG;
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
