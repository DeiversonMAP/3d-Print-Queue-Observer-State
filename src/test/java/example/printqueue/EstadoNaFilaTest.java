package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoNaFilaTest {

    @Test
    void deveIniciarEIrParaImprimindo() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.iniciar();
        assertEquals("Imprimindo", trabalho.getEstadoAtual());
    }

    @Test
    void naoDeveMudarEstadoAoPausarNaFila() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.pausar();
        assertEquals("NaFila", trabalho.getEstadoAtual());
    }

    @Test
    void deveFalharDiretoDaFila() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.falhar();
        assertEquals("Falhou", trabalho.getEstadoAtual());
    }
}
