package Modelo.Status;

import Modelo.Solicitacao;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"solicitacao"})
public class AguardandoRH implements IStatus {

    private Solicitacao solicitacao;
    
    @Override
    public void solicitar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível solicitar, solicitação já iniciada!");
    }

    @Override
    public void aprovar(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
        this.solicitacao.setStatus(Status.Aprovada);
        
        System.out.println("Solicitação aprovada com sucesso.");
    }

    @Override
    public void recusar(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
        this.solicitacao.setStatus(Status.Recusada);
        
        System.out.println("Solicitação recusada!");
    }

    @Override
    public void retornar(Solicitacao solicitacao, String observacao) {
        this.solicitacao = solicitacao;
        
        this.solicitacao.setObservacao(observacao);
        this.solicitacao.setStatus(Status.AguardandadoChefia);
        
        System.out.println("Solicitação retornada para CHEFIA!");
    }
}
