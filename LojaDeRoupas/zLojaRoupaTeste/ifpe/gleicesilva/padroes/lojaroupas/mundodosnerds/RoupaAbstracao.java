package ifpe.gleicesilva.padroes.lojaroupas.mundodosnerds;

public abstract class RoupaAbstracao {

	//Herança via atributo
	//A classe RoupaAbstracao tem as coisas de corImp pelo atributo imp
	private CorImp impC;
	private GeneroImp impG;
	private TamanhoImp impT;
	private EstampaImp impE;
	private MaterialImp impM;
	private Strategy strategy;
	private String tipoRoupa;
	private String tipoCor;
	private String tipoGenero;
	private String tipoTamanho;
	private String tipoEstampa;
	private String tipoMaterial;
	
	public abstract Strategy createStrategy();
	
	public void escolherRoupa() {
		this.strategy = createStrategy();
		strategy.escRoupa();
	}
	
	
	/***********************************************************
	GÊNEROS
	***********************************************************/
	
	public void escolherGeneroMasculino() {
		getImpG().generoRoupaMasculino();
	}
	
	public void escolherGeneroFeminino() {
		getImpG().generoRoupaFeminino();
	}
	
	
	/***********************************************************
	TAMANHOS
	***********************************************************/
	
	public void escolherTamanhoP () {
		getImpT().tamanhoRoupaP();
	}
	
	public void escolherTamanhoM () {
		getImpT().tamanhoRoupaM();
	}
	
	public void escolherTamanhoG () {
		getImpT().tamanhoRoupaG();
	}
	
	/***********************************************************
	CORES
	***********************************************************/
	
	public void escolherCorAmarelo() {
		getImpC().corRoupaAmarelo();
	}
	
	public void escolherCorAzul() {
		getImpC().corRoupaAzul();
	}
	
	public void escolherCorBranco() {
		getImpC().corRoupaBranco();
	}
	
	
	/***********************************************************
	ESTAMPAS
	***********************************************************/
	
	public void escolherEstampaBola() {
		getImpE().estampaRoupaBola();
	}
	
	public void escolherEstampaFlor() {
		getImpE().estampaRoupaFlor();
	}
	
	public void escolherEstampaLisa() {
		getImpE().estampaRoupaLisa();
	}
	
	
	/***********************************************************
	MATERIAIS
	***********************************************************/
	
	public void escolhermaterialJeans() {
		getImpM().materialRoupaJeans();
	}
	
	public void escolherMaterialLinho() {
		getImpM().materialRoupaLinho();
	}
	
	public void escolherMaterialMalha() {
		getImpM().tamanhoRoupaMalha();
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
	
	public MaterialImp getImpM() {
		return impM;
	}

	public void setImpM(MaterialImp impM) {
		this.impM = impM;
	}

	public String getTipoRoupa() {
		return tipoRoupa;
	}

	public void setTipoRoupa(String tipoRoupa) {
		this.tipoRoupa = tipoRoupa;
	}

	public String getTipoCor() {
		return tipoCor;
	}

	public void setTipoCor(String tipoCor) {
		this.tipoCor = tipoCor;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public String getTipoTamanho() {
		return tipoTamanho;
	}

	public void setTipoTamanho(String tipoTamanho) {
		this.tipoTamanho = tipoTamanho;
	}

	public String getTipoEstampa() {
		return tipoEstampa;
	}

	public void setTipoEstampa(String tipoEstampa) {
		this.tipoEstampa = tipoEstampa;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	
	
}
