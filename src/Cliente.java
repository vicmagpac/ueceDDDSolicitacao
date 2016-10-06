import modelo.Funcionario;
import modelo.Solicitacao;


public class Cliente {
	public static void main(String args[]) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(1);
		funcionario.setNome("Victor Magalhães");
		funcionario.setChefe(true);
		
		// funcionário solicitação
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.solicitar();
		
		// ANALISE CHEFIA
		solicitacao.aprovar();
		
		// ANALISE RH
		solicitacao.retornar("Volta, falta algumas informações");
		
		// VOLTA PRA CHEFIA
		solicitacao.aprovar();
	
		// NOVO ANALISE RH
		solicitacao.aprovar();
	}
}
