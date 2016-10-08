package Test;

import org.junit.Test;

import Modelo.Funcionario;
import Modelo.Solicitacao;
import Modelo.Status.AguardandadoChefia;
import Modelo.Status.AguardandoRH;
import Modelo.Status.Aprovada;
import Modelo.Status.Recusada;

import static org.junit.Assert.*;

public class AguardandoRHTest {

    @Test(expected = IllegalStateException.class)
    public void testSolicitar() throws Exception {
        AguardandoRH instance = montaCenario();
        instance.solicitar();
    }

    @Test
    public void testAprovar() throws Exception {
        AguardandoRH instance = montaCenario();
        instance.aprovar();
        assertEquals(new Aprovada(), instance.getSolicitacao().getStatus());
    }

    @Test
    public void testRecusar() throws Exception {
        AguardandoRH instance = montaCenario();
        instance.recusar();
        assertEquals(new Recusada(), instance.getSolicitacao().getStatus());
    }
    
    @Test
    public void testRetornar() throws Exception {
        AguardandoRH instance = montaCenario();
        instance.retornar("Mensagem de observação");
        assertEquals(new AguardandadoChefia(), instance.getSolicitacao().getStatus());
    }

    private AguardandoRH montaCenario() {
        //Cenário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("JOAO");
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setFuncionario(funcionario);

        AguardandoRH instance = new AguardandoRH();
        instance.setSolicitacao(solicitacao);
        return instance;
    }

}
