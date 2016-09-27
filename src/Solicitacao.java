import java.util.Date;

import Status.NovaSolicitacao;
import Status.Status;


/**
 * 
 * @author victor
 * Solicitação de abono
 */
public class Solicitacao {
	int id;
	Funcionario funcionario;
	Date inicio;
	Date fim;
	String motivo;
	String observacao;
	Status status = new NovaSolicitacao();
	
	public String solicitar() {
		return null;
	}
	
	public String aprovar() {
		return null;
	}
	
	public String recusar() {
		return null;
	}
	
	public String retornar() {
		return null;
	}
}
