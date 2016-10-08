package Modelo.Status;

public class Recusada extends Status {

	@Override
	public void solicitar() {
		throw new IllegalStateException("Não é possível solicitar, solicitação já recusada!");
		
	}

	@Override
	public void aprovar() {
		throw new IllegalStateException("Não é possível aprovar, solicitação já recusada!");
		
	}

	@Override
	public void recusar() {
		throw new IllegalStateException("Não é possível recusada, solicitação já recusada!");
		
	}

	@Override
	public void retornar(String observacao) {
		throw new IllegalStateException("Não é possível retornar, solicitação já recusada!");
		
	}
	
}
