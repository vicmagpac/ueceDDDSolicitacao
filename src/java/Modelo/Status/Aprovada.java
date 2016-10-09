package Modelo.Status;

import Modelo.Solicitacao;

public class Aprovada implements IStatus {
    
    @Override
    public void solicitar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível solicitar, solicitação já APROVADA!");

    }

    @Override
    public void aprovar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível aprovar, solicitação já APROVADA!");

    }

    @Override
    public void recusar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível recusar, solicitação já APROVADA!");

    }

    @Override
    public void retornar(Solicitacao solicitacao, String observacao) {
        throw new IllegalStateException("Não é possível retornar, solicitação já APROVADA!");
    }
}
