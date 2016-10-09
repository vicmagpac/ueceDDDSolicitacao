package Test;

import Modelo.Funcionario;
import Modelo.Solicitacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Modelo.Status.Aprovada;
import Modelo.Status.Status;

import static org.junit.Assert.*;

public class AprovadaTest {
    
    private Solicitacao solicitacao;

    @Test(expected = IllegalStateException.class)
    public void testSolicitar() throws Exception {
        this.montaCenario();
        this.solicitacao.solicitar();
    }

    @Test(expected = IllegalStateException.class)
    public void testAprovar() throws Exception {
        this.montaCenario();
        this.solicitacao.aprovar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRecusar() throws Exception {
        this.montaCenario();
        this.solicitacao.recusar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRetornar() throws Exception {
        this.montaCenario();
        this.solicitacao.retornar("Mensagem observação");
    }

    private void montaCenario(){
        //Cenário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("JOAO");
        
        this.solicitacao = new Solicitacao();
        this.solicitacao.setFuncionario(funcionario);
        
        this.solicitacao.setStatus(Status.Aprovada);
    }
}
