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
	
	public String solicitar() {
		return null;
	}
	
	public String aprovar() {
		return null;
	}
	
	public String recusar() {
		return null;
	}
	
	public String retornar(String observacao) {
		return null;
	}
}
