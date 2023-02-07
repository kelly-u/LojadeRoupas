package ifpe.padroes.lojaroupas;

public class TamanhoPImp extends TamanhoImp {

	@Override
	public String tamanhoRoupaImp(String t) {
		t = "P";
		System.out.println("Tamanho P escolhido!");
		return t;
	}

}
