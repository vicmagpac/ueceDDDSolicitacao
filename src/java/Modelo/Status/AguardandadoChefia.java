package Modelo.Status;

import Modelo.Solicitacao;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"solicitacao"})
public class AguardandadoChefia implements IStatus {

    private Solicitacao solicitacao;
    
    @Override
    public void solicitar(Solicitacao solicitacao) {
        throw new IllegalStateException("Não é possível solicitar, solicitação já iniciada!");
    }

    @Override
    public void aprovar(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
        this.solicitacao.setStatus(Status.AguardandoRH);
        
        System.out.println("Solicitação aprovada e redirecionada para o RH!");

    }

    @Override
    public void recusar(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
        this.solicitacao.setStatus(Status.Recusada);
        
        System.out.println("Solicitação recusada!");
    }

    @Override
    public void retornar(Solicitacao solicitacao, String observacao) {
        throw new IllegalStateException("Não é possível retornar!");
    }

    public void solicitar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
