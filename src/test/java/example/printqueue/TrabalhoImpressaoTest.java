package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhoImpressaoTest {

    @Test
    void deveComecarNaFila() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Busto");
        assertEquals("NaFila", trabalho.getEstadoAtual());
    }

    @Test
    void deveNotificarMultiplosObservadoresNaMesmaTransicao() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Busto");
        PainelOficina painel = new PainelOficina();
        LogEventos log = new LogEventos();
        NotificacaoCliente notificacao = new NotificacaoCliente();

        trabalho.inscrever(painel);
        trabalho.inscrever(log);
        trabalho.inscrever(notificacao);

        trabalho.iniciar();
        trabalho.concluir();

        assertEquals("Painel: Busto saiu de Imprimindo para Concluido", painel.getUltimaAtualizacao());
        assertEquals(2, log.getEventos().size());
        assertEquals("Sua peça \"Busto\" ficou pronta!", notificacao.getUltimaMensagem());
    }

    @Test
    void naoDeveNotificarObservadorDesinscrito() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Busto");
        PainelOficina painel = new PainelOficina();

        trabalho.inscrever(painel);
        trabalho.desinscrever(painel);
        trabalho.iniciar();

        assertNull(painel.getUltimaAtualizacao());
    }
}
