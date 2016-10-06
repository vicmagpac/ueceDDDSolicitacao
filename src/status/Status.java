package status;

import modelo.Solicitacao;

public abstract class Status {
	
	protected Solicitacao solicitacao;
	
	public Status setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
		return this.solicitacao.getStatus();
	}
	
	public abstract void solicitar();
	public abstract void aprovar();
	public abstract void recusar();
	public abstract void retornar(String observacao);
}
