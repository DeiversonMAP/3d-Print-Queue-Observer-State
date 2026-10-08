package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoClienteTest {

    @Test
    void deveNotificarClienteQuandoConcluido() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Suporte");
        NotificacaoCliente notificacao = new NotificacaoCliente();
        trabalho.inscrever(notificacao);

        trabalho.iniciar();
        trabalho.concluir();

        assertEquals("Sua peça \"Suporte\" ficou pronta!", notificacao.getUltimaMensagem());
    }

    @Test
    void deveNotificarClienteQuandoFalhar() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Suporte");
        NotificacaoCliente notificacao = new NotificacaoCliente();
        trabalho.inscrever(notificacao);

        trabalho.iniciar();
        trabalho.falhar();

        assertEquals("Houve um problema na impressão de \"Suporte\".", notificacao.getUltimaMensagem());
    }

    @Test
    void naoDeveNotificarEmTransicoesIntermediarias() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Suporte");
        NotificacaoCliente notificacao = new NotificacaoCliente();
        trabalho.inscrever(notificacao);

        trabalho.iniciar();

        assertNull(notificacao.getUltimaMensagem());
    }
}
