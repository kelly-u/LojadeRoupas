package ifpe.padroes.lojaroupas;

public class Saia extends RoupaAbstracao {

	@Override
	public Strategy createStrategy() {
		return new SaiaStrategy();
	}
	
	public String corRoupa(String cor){
		super.corRoupa(cor);
		return cor;
	}
	
	public String materialRoupa(String material) {
		super.materialRoupa(material);	
		return material;
	}
	
	public String tamanhoRoupa(String tamanho) {
		super.tamanhoRoupa(tamanho);
		return tamanho;
	}
	
	public String estampaRoupa(String estampa) {
		super.estampaRoupa(estampa);
		return estampa;
	}
	
	public String generoRoupa(String genero) {
		super.generoRoupa(genero);
		return genero;
	}
	
}
