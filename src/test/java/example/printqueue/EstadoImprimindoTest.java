package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoImprimindoTest {

    @Test
    void devePausarEIrParaPausado() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.iniciar();
        trabalho.pausar();
        assertEquals("Pausado", trabalho.getEstadoAtual());
    }

    @Test
    void deveConcluirEIrParaConcluido() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.iniciar();
        trabalho.concluir();
        assertEquals("Concluido", trabalho.getEstadoAtual());
    }

    @Test
    void deveFalharDuranteImpressao() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.iniciar();
        trabalho.falhar();
        assertEquals("Falhou", trabalho.getEstadoAtual());
    }
}
