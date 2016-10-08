package Test;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Modelo.Funcionario;
import Modelo.Solicitacao;
import Modelo.Status.AguardandadoChefia;
import Modelo.Status.AguardandoRH;
import Modelo.Status.Recusada;

import static org.junit.Assert.*;

public class AguardandoChefiaTest {

    @Test(expected = IllegalStateException.class)
    public void testSolicitar() throws Exception {
        AguardandadoChefia instance = montaCenario();
        instance.solicitar();
    }
    
    @Test
    public void testAprovar() throws Exception {
        AguardandadoChefia instance = montaCenario();
        instance.aprovar();
        assertEquals(new AguardandoRH(), instance.getSolicitacao().getStatus());
    }
    
    @Test
    public void testRecusar() throws Exception {
        AguardandadoChefia instance = montaCenario();
        instance.recusar();
        assertEquals(new Recusada(), instance.getSolicitacao().getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testRetornar() throws Exception {
        AguardandadoChefia instance = montaCenario();
        instance.retornar("Mensagem de observação");
    }

    private AguardandadoChefia montaCenario(){
        //Cenário
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("JOAO");
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setFuncionario(funcionario);

        AguardandadoChefia instance = new AguardandadoChefia();
        instance.setSolicitacao(solicitacao);
        return instance;
    }
}
