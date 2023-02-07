package ifpe.padroes.lojaroupas;

public class TamanhoMImp extends TamanhoImp {

	@Override
	public String tamanhoRoupaImp(String t) {
		t = "M";
		System.out.println("Tamanho M escolhido!");
		return t;
	}

}
