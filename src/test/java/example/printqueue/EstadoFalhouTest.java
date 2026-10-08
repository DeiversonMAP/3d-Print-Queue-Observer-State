package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoFalhouTest {

    @Test
    void naoDeveMudarEstadoAoChamarQualquerAcao() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Figurinha");
        trabalho.falhar();

        trabalho.iniciar();
        trabalho.pausar();
        trabalho.retomar();
        trabalho.concluir();

        assertEquals("Falhou", trabalho.getEstadoAtual());
    }
}
