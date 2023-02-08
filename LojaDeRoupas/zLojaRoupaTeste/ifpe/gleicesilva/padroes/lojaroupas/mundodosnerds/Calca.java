package ifpe.gleicesilva.padroes.lojaroupas.mundodosnerds;

public class Calca extends RoupaAbstracao {

	@Override
	public Strategy createStrategy() {
		return new CalcaStrategy();
	}
	
	public void escolherCorRoupa() {
		super.escolherCorAmarelo();
		super.escolherCorAzul();
		super.escolherCorBranco();
	}
	
	public void escolherGeneroRoupa() {
		super.escolherGeneroMasculino();
		super.escolherGeneroFeminino();
	}
	
	public void escolherTamanhoRoupa() {
		super.escolherTamanhoP();
		super.escolherTamanhoM();
		super.escolherTamanhoG();
	}

	public void escolherEstampaRoupa() {
		super.escolherEstampaBola();
		super.escolherEstampaFlor();
		super.escolherEstampaLisa();
	}
	
	public void escolherMaterialRoupa() {
		super.escolhermaterialJeans();
		super.escolherMaterialLinho();
		super.escolherMaterialMalha();
	}
	
}






