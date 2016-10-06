package modelo;
import java.util.Date;

import status.NovaSolicitacao;
import status.Status;

public class Solicitacao {
	
	private int id;
	private Funcionario funcionario;
	private Date inicio;
	private Date fim;
	private String motivo;
	private String observacao;
	private Status status = new NovaSolicitacao();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void solicitar() {
		this.status.setSolicitacao(this).solicitar();
	}
	
	public void aprovar() {
		this.status.setSolicitacao(this).aprovar();
	}
	
	public void recusar() {
		this.status.setSolicitacao(this).recusar();
	}
	
	public void retornar(String observacao) {
		this.status.setSolicitacao(this).retornar(observacao);
	}
}
