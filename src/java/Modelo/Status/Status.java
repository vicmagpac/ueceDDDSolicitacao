package Modelo.Status;

import Modelo.Solicitacao;
import Modelo.Status.IStatus;

public enum Status implements IStatus {

    NovaSolicitacao(new NovaSolicitacao()),
    AguardandadoChefia(new AguardandadoChefia()),
    AguardandoRH(new AguardandoRH()),
    Aprovada(new Aprovada()),
    Recusada(new Recusada());
    
    private IStatus status;

    Status(IStatus status) {
        this.status = status;
    }

    @Override
    public void solicitar(Solicitacao solicitacao) {
        this.status.solicitar(solicitacao);
    }

    @Override
    public void aprovar(Solicitacao solicitacao) {
        this.status.aprovar(solicitacao);
    }

    @Override
    public void recusar(Solicitacao solicitacao) {
        this.status.recusar(solicitacao);
    }

    @Override
    public void retornar(Solicitacao solicitacao, String observacao) {
        this.status.retornar(solicitacao, observacao);
    }
        
}