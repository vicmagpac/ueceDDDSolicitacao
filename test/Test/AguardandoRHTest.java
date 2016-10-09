package Test;

import org.junit.Test;

import Modelo.Funcionario;
import Modelo.Solicitacao;
import Modelo.Status.AguardandadoChefia;
import Modelo.Status.AguardandoRH;
import Modelo.Status.Aprovada;
import Modelo.Status.Recusada;
import Modelo.Status.Status;

import static org.junit.Assert.*;

public class AguardandoRHTest {

    private Solicitacao solicitacao;
    
    @Test(expected = IllegalStateException.class)
    public void testSolicitar() throws Exception {
        this.montaCenario();
        this.solicitacao.solicitar();
    }

    
    @Test
    public void testAprovar() throws Exception {
        this.montaCenario();
        this.solicitacao.aprovar();
        assertEquals(Status.Aprovada, this.solicitacao.getStatus());
    }

    
    @Test
    public void testRecusar() throws Exception {
        this.montaCenario();
        this.solicitacao.recusar();
        assertEquals(Status.Recusada, this.solicitacao.getStatus());
    }
    
    @Test
    public void testRetornar() throws Exception {
        this.montaCenario();
        this.solicitacao.retornar("Mensagem de observação");
        assertEquals(Status.AguardandadoChefia, this.solicitacao.getStatus());
    }
    
    private void montaCenario(){
        //Cenário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("JOAO");
        
        this.solicitacao = new Solicitacao();
        this.solicitacao.setFuncionario(funcionario);
        
        this.solicitacao.setStatus(Status.AguardandoRH);
    }

}
