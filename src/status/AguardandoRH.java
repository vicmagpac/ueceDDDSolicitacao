package status;

public class AguardandoRH extends Status {

	@Override
	public void solicitar() {
		throw new IllegalStateException("Não é possível solicitar, solicitação já iniciada!");
	}

	@Override
	public void aprovar() {
		System.out.println("Solicitação aprovada com sucesso.");
		this.solicitacao.setStatus(new Aprovada());		
	}

	@Override
	public void recusar() {
		System.out.println("Solicitação recusada!");
		this.solicitacao.setStatus(new Recusada());
	}

	@Override
	public void retornar(String observacao) {
		System.out.println("Solicitação retornada para CHEFIA!");
		
		this.solicitacao.setObservacao(observacao);
		this.solicitacao.setStatus(new AguardandadoChefia());
	}
	
}
