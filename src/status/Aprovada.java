package status;

public class Aprovada extends Status {

	@Override
	public void solicitar() {
		throw new IllegalStateException("Não é possível solicitar, solicitação já APROVADA!");
		
	}

	@Override
	public void aprovar() {
		throw new IllegalStateException("Não é possível aprovar, solicitação já APROVADA!");
		
	}

	@Override
	public void recusar() {
		throw new IllegalStateException("Não é possível recusar, solicitação já APROVADA!");
		
	}

	@Override
	public void retornar(String observacao) {
		throw new IllegalStateException("Não é possível retornar, solicitação já APROVADA!");
	}
	
}
