package Test;

import Modelo.Funcionario;
import Modelo.Solicitacao;

import org.junit.Test;

import Modelo.Status.AguardandadoChefia;
import Modelo.Status.NovaSolicitacao;
import Modelo.Status.Status;
import static org.junit.Assert.*;


public class NovaSolicitacaoTest {
    
    private Solicitacao solicitacao;

    @Test
    public void testSolicitar() {
        //Cenário
        this.montaCenario();
        this.solicitacao.solicitar();

        //Validação
        assertEquals(Status.AguardandadoChefia, this.solicitacao.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testAprovar() throws Exception {
        //Cenário
        this.montaCenario();
        this.solicitacao.aprovar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRecusar() throws Exception {
        //Cenário
        this.montaCenario();

        this.solicitacao.recusar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRetornar() throws Exception {
        //Cenário
        this.montaCenario();

        this.solicitacao.retornar("Mensagem observação");
    }
    private void montaCenario(){
        //Cenário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("JOAO");
        
        this.solicitacao = new Solicitacao();
        this.solicitacao.setFuncionario(funcionario);
    }
}
