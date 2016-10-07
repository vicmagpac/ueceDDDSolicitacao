package test;

import org.junit.Test;

import status.Recusada;

public class RecusadaTest {

    @Test(expected = IllegalStateException.class)
    public void testSolicitar() throws Exception {
        Recusada instance = new Recusada();
        instance.solicitar();
    }

    @Test(expected = IllegalStateException.class)
    public void testAprovar() throws Exception {
        Recusada instance = new Recusada();
        instance.aprovar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRecusar() throws Exception {
        Recusada instance = new Recusada();
        instance.recusar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRetornar() throws Exception  {
        Recusada instance = new Recusada();
        instance.retornar("Mensagem observação");
    }

}
