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
	private boolean isSaia = false;
	private boolean isCalca = false;
	private boolean isBlusa = false;
	
	public abstract Strategy createStrategy();
	
	public void escolherRoupa() {
		this.strategy = createStrategy();
		strategy.escRoupa();
	}
	
	public String corRoupa(String cor){
		getImpC().corRoupaImp(cor);
		return cor;
	}
	
	public String materialRoupa(String material) {
		getImpM().materialRoupaImp(material);	
		return material;
	}
	
	public String tamanhoRoupa(String tamanho) {
		getImpT().tamanhoRoupaImp(tamanho);	
		return tamanho;
	}
	
	public String estampaRoupa(String estampa) {
		getImpE().estampaRoupaImp(estampa);	
		return estampa;
	}
	
	public String generoRoupa(String genero) {
		getImpG().generoRoupaImp(genero);
		return genero;
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

	public boolean isSaia() {
		return isSaia;
	}

	public void setSaia(boolean isSaia) {
		this.isSaia = isSaia;
	}

	public boolean isCalca() {
		return isCalca;
	}

	public void setCalca(boolean isCalca) {
		this.isCalca = isCalca;
	}

	public boolean isBlusa() {
		return isBlusa;
	}

	public void setBlusa(boolean isBlusa) {
		this.isBlusa = isBlusa;
	}
	
	
}
