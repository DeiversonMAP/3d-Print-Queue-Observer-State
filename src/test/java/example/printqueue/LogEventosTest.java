package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogEventosTest {

    @Test
    void deveAcumularTodosOsEventos() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Chaveiro");
        LogEventos log = new LogEventos();
        trabalho.inscrever(log);

        trabalho.iniciar();
        trabalho.pausar();
        trabalho.retomar();
        trabalho.concluir();

        assertEquals(4, log.getEventos().size());
        assertEquals("[Chaveiro] NaFila -> Imprimindo", log.getEventos().get(0));
        assertEquals("[Chaveiro] Imprimindo -> Pausado", log.getEventos().get(1));
        assertEquals("[Chaveiro] Pausado -> Imprimindo", log.getEventos().get(2));
        assertEquals("[Chaveiro] Imprimindo -> Concluido", log.getEventos().get(3));
    }
}
