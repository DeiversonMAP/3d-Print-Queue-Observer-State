package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoPausadoTest {

    @Test
    void deveRetomarEVoltarParaImprimindo() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.iniciar();
        trabalho.pausar();
        trabalho.retomar();
        assertEquals("Imprimindo", trabalho.getEstadoAtual());
    }

    @Test
    void naoDeveConcluirDiretoDoPausado() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.iniciar();
        trabalho.pausar();
        trabalho.concluir();
        assertEquals("Pausado", trabalho.getEstadoAtual());
    }
}
