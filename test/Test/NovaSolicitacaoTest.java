package Test;

import Modelo.Funcionario;
import Modelo.Solicitacao;

import org.junit.Test;

import Modelo.Status.AguardandadoChefia;
import Modelo.Status.NovaSolicitacao;
import static org.junit.Assert.*;


public class NovaSolicitacaoTest {

    @Test
    public void testSolicitar() {
        //Cenário
        NovaSolicitacao instance = montaCenario();

        //Ação
        instance.solicitar();

        //Validação
        assertEquals(new AguardandadoChefia(), instance.getSolicitacao().getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testAprovar() throws Exception {
        //Cenário
        NovaSolicitacao instance = montaCenario();

        instance.aprovar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRecusar() throws Exception {
        //Cenário
        NovaSolicitacao instance = montaCenario();

        instance.recusar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRetornar() throws Exception {
        //Cenário
        NovaSolicitacao instance = montaCenario();

        instance.retornar("Mensagem observação");
    }

    private NovaSolicitacao montaCenario(){
        //Cenário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("JOAO");
        
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setFuncionario(funcionario);

        NovaSolicitacao instance = new NovaSolicitacao();
        instance.setSolicitacao(solicitacao);
        return instance;
    }
}
