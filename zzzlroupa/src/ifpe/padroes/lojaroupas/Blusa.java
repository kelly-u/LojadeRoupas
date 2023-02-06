package ifpe.padroes.lojaroupas;

public class Blusa extends RoupaAbstracao {

	@Override
	public Strategy createStrategy() {
		return new BlusaStrategy();
	}
	
	public void corRoupa(){
		super.corRoupa();
	}
	
	public void materialRoupa() {
		super.materialRoupa();	
	}
	
	public void tamanhoRoupa() {
		super.tamanhoRoupa();
	}
	
	public void estampaRoupa() {
		super.estampaRoupa();
	}
	
	public void generoRoupa() {
		super.generoRoupa();
	}
	
}
