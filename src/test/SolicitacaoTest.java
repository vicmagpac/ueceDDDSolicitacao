package test;


import org.junit.Test;

import modelo.Funcionario;
import modelo.Solicitacao;
import status.AguardandadoChefia;
import status.AguardandoRH;
import status.Aprovada;
import status.NovaSolicitacao;
import status.Recusada;
import status.Status;

import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class SolicitacaoTest {


    @BeforeClass
    public static void setUp() {
    }


 
    @Test
    public void testSolicitar() throws Exception {
        Solicitacao solicitacao = montaCenario();

        solicitacao.solicitar();

        Status statusEsperado = new AguardandadoChefia();
        assertEquals(statusEsperado, solicitacao.getStatus());
    }

    private Solicitacao montaCenario() {
        
    	Funcionario funcionario = new Funcionario();
        funcionario.setNome("JOAO");
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setFuncionario(funcionario);
        return solicitacao;
    }

    public void testHappyDay() throws Exception {
        Solicitacao solicitacao = montaCenario();

        Status result1 = solicitacao.getStatus();
        solicitacao.solicitar();
        Status result2 = solicitacao.getStatus();
        solicitacao.aprovar();
        Status result3 = solicitacao.getStatus();
        solicitacao.aprovar();
        Status result4 = solicitacao.getStatus();

        assertEquals(new NovaSolicitacao(), result1);
        assertEquals(new AguardandadoChefia(), result2);
        assertEquals(new AguardandoRH(), result3);
        assertEquals(new Aprovada(), result4);
    }

    @Test
    public void testSolicitacaoRecusadaPelaChefia() throws Exception {
        Solicitacao solicitacao = montaCenario();

        solicitacao.solicitar();
        solicitacao.recusar();

        assertEquals(new Recusada(), solicitacao.getStatus());
    }

    @Test
    public void testSolicitacaoRecusadaPeloRH() throws Exception {
        Solicitacao solicitacao = montaCenario();
        solicitacao.solicitar();
        solicitacao.aprovar();

        solicitacao.recusar();

        assertEquals(new Recusada(), solicitacao.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testSolicitacaoNovaNaoPodeSerAprovada() throws Exception {
        Solicitacao solicitacao = montaCenario();

        solicitacao.aprovar();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolicitacaoNovaNaoPodeSerRecusada() throws Exception {
        Solicitacao solicitacao = montaCenario();

        solicitacao.recusar();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolicitacaoAprovadaNaoPodeSerRetornada() throws Exception {
        Solicitacao solicitacao = montaCenario();

        solicitacao.aprovar();
        solicitacao.aprovar();

        solicitacao.retornar("Faltou um documento");
    }

    @Test(expected = IllegalStateException.class)
    public void testSolicitacaoAprovadaNaoPodeSerRecusada() throws Exception {
        Solicitacao solicitacao = montaCenario();

        solicitacao.aprovar();
        solicitacao.aprovar();

        solicitacao.recusar();
    }

    @Test(expected = IllegalStateException.class)
    public void testSolicitacaoRecusadaNaoPodeSerAprovada() throws Exception {
        Solicitacao solicitacao = montaCenario();

        solicitacao.solicitar();
        solicitacao.recusar();

        solicitacao.aprovar();
    }

}
