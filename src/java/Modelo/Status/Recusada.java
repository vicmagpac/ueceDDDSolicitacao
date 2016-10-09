package Modelo.Status;

import Modelo.Solicitacao;

public class Recusada implements IStatus {

    @Override
    public void solicitar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível solicitar, solicitação já recusada!");

    }

    @Override
    public void aprovar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível aprovar, solicitação já recusada!");

    }

    @Override
    public void recusar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível recusada, solicitação já recusada!");

    }

    @Override
    public void retornar(Solicitacao solicitacao, String observacao) {
        throw new IllegalStateException("Não é possível retornar, solicitação já recusada!");

    }

}
