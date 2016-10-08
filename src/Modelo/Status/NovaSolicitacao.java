package Modelo.Status;

public class NovaSolicitacao extends Status {

	@Override
	public void solicitar() {
		System.out.println("Solicitação efetuada com sucesso.");	
		this.solicitacao.setStatus(new AguardandadoChefia());
	}

	@Override
	public void aprovar() {
		throw new IllegalStateException("Não é possivel aprovar, solicitação aguardando chefia");
		
	}

	@Override
	public void recusar() {
		throw new IllegalStateException("Não é possivel recusar, solicitação aguardando chefia");
		
	}

	@Override
	public void retornar(String observacao) {
		throw new IllegalStateException("Não é possivel retornar, solicitação aguardando chefia");		
	}
	
	
	
}
