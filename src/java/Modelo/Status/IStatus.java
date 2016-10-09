package Modelo.Status;

import Modelo.Solicitacao;

public interface IStatus {
    
    public void solicitar(Solicitacao solicitacao);

    public void aprovar(Solicitacao solicitacao);

    public void recusar(Solicitacao solicitacao);

    public void retornar(Solicitacao solicitacao, String observacao);
}
