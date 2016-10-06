package status;

public class AguardandadoChefia extends Status {

	@Override
	public void solicitar() {
		throw new IllegalStateException("Não é possível solicitar, solicitação já iniciada!");	
	}

	@Override
	public void aprovar() {
		System.out.println("Solicitação aprovada e redirecionada para o RH!");
		this.solicitacao.setStatus(new AguardandoRH());
		
	}

	@Override
	public void recusar() {
		System.out.println("Solicitação recusada!");
		this.solicitacao.setStatus(new Recusada());
	}

	@Override
	public void retornar(String observacao) {
		throw new IllegalStateException("Não é possível retornar!");	
		
	}
	
}
