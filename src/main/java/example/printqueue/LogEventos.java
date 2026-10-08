package example.printqueue;

import java.util.ArrayList;
import java.util.List;

public class LogEventos implements IObservadorTrabalho {

    private final List<String> eventos = new ArrayList<>();

    @Override
    public void atualizar(TrabalhoImpressao trabalho, String estadoAnterior, String estadoNovo) {
        eventos.add("[" + trabalho.getNomePeca() + "] " + estadoAnterior + " -> " + estadoNovo);
    }

    public List<String> getEventos() {
        return eventos;
    }
}
