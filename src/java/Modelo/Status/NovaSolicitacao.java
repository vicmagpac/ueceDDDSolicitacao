package Modelo.Status;

import Modelo.Solicitacao;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"solicitacao"})
public class NovaSolicitacao implements IStatus {

    private Solicitacao solicitacao;
    
    @Override
    public void solicitar(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
        this.solicitacao.setStatus(Status.AguardandadoChefia);
        System.out.println("Solicitação efetuada com sucesso.");
    }

    @Override
    public void aprovar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possivel aprovar, solicitação aguardando chefia");

    }

    @Override
    public void recusar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possivel recusar, solicitação aguardando chefia");

    }

    @Override
    public void retornar(Solicitacao solicitacao, String observacao) {
        throw new IllegalStateException("Não é possivel retornar, solicitação aguardando chefia");
    }
}
