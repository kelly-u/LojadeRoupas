package ifpe.padroes.lojaroupas;

public class TamanhoGImp extends TamanhoImp {

	@Override
	public String tamanhoRoupaImp(String t) {
		t = "G";
		System.out.println("Tamanho G escolhido!");
		return t;
	}

}
