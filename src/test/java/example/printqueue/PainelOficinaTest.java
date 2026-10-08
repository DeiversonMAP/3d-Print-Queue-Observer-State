package example.printqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PainelOficinaTest {

    @Test
    void deveRegistrarTransicaoDeEstado() {
        TrabalhoImpressao trabalho = new TrabalhoImpressao("Busto");
        PainelOficina painel = new PainelOficina();
        trabalho.inscrever(painel);

        trabalho.iniciar();

        assertEquals("Painel: Busto saiu de NaFila para Imprimindo", painel.getUltimaAtualizacao());
    }
}
