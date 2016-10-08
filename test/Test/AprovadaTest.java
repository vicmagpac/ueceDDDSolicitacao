package Teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Modelo.Status.Aprovada;

import static org.junit.Assert.*;

public class AprovadaTest {

    @Test(expected = IllegalStateException.class)
    public void testSolicitar() throws Exception {
        Aprovada instance = new Aprovada();
        instance.solicitar();
    }

    @Test(expected = IllegalStateException.class)
    public void testAprovar() throws Exception {
        Aprovada instance = new Aprovada();
        instance.aprovar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRecusar() throws Exception {
        Aprovada instance = new Aprovada();
        instance.recusar();
    }

    @Test(expected = IllegalStateException.class)
    public void testRetornar() throws Exception {
        Aprovada instance = new Aprovada();
        instance.retornar("Mensagem de retorno");
    }

}
