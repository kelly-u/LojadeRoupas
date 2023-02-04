package ifpe.padroes.projeto.roupa;

public abstract class Strategy {
	
	public abstract void escRoupa();
	public void escTamRoupa() {
		enum tamRoupa {
			PP, P, M, G, GG, XG, XGG;
		}
	}
	public void escCorRoupa() {
		enum corRoupa {
			AMARELO, VERDE, VERMELHO, BRANCO, ROSA;
		}
	}
	public void escMatRoupa() {
		enum matRoupa {
			LINHO, MALHA, ALOGODÃO;
		}
	}
	public void escEstRoupa() {
		enum estRoupa{
			FLOR, BOLA, LISA, TRIÂNGULO;
		}
	}
	public void escGenRoupa() {
		enum genRoupa{
			MASCULINO, FEMININO;
		}
	}
	
}
