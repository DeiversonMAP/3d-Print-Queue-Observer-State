package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoConcluidoTest {

    @Test
    void naoDeveMudarEstadoAoChamarQualquerAcao() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.iniciar();
        trabalho.concluir();

        trabalho.iniciar();
        trabalho.pausar();
        trabalho.retomar();
        trabalho.falhar();

        assertEquals("Concluido", trabalho.getEstadoAtual());
    }
}
