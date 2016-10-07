package status;

import modelo.Solicitacao;

public abstract class Status {
	
	protected Solicitacao solicitacao;
	
	public Status setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
		return this.solicitacao.getStatus();
	}
	
	public Solicitacao getSolicitacao() {
		return this.solicitacao;
	}
	
	public abstract void solicitar();
	public abstract void aprovar();
	public abstract void recusar();
	public abstract void retornar(String observacao);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((solicitacao == null) ? 0 : solicitacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Status other = (Status) obj;
		if (solicitacao == null) {
			if (other.solicitacao != null)
				return false;
		} else if (!solicitacao.equals(other.solicitacao))
			return false;
		return true;
	}
	
	
}
