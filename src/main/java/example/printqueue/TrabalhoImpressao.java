package example.printqueue;

import java.util.ArrayList;
import java.util.List;

/**
 * É, ao mesmo tempo:
 * - o CONTEXTO do padrão State: delega iniciar/pausar/retomar/concluir/falhar
 *   para o IEstadoTrabalho atual, que decide se a transição é permitida;
 * - o SUJEITO do padrão Observer: toda vez que o estado muda de fato,
 *   notifica automaticamente todos os observadores inscritos.
 *
 * Os dois padrões se encontram em mudarEstado(): é o ÚNICO ponto do sistema
 * onde o estado muda e, no mesmo instante, a notificação é disparada —
 * garantindo que nenhuma transição passe sem avisar quem está observando.
 */
public class TrabalhoImpressao {

    private final String nomePeca;
    private IEstadoTrabalho estado;
    private final List<IObservadorTrabalho> observadores = new ArrayList<>();

    public TrabalhoImpressao(String nomePeca) {
        this.nomePeca = nomePeca;
        this.estado = new EstadoNaFila();
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public String getEstadoAtual() {
        return estado.getNome();
    }

    public void inscrever(IObservadorTrabalho observador) {
        observadores.add(observador);
    }

    public void desinscrever(IObservadorTrabalho observador) {
        observadores.remove(observador);
    }

    void mudarEstado(IEstadoTrabalho novoEstado) {
        String estadoAnterior = estado.getNome();
        this.estado = novoEstado;
        String estadoNovo = estado.getNome();

        for (IObservadorTrabalho observador : observadores) {
            observador.atualizar(this, estadoAnterior, estadoNovo);
        }
    }

    public void iniciar() {
        estado.iniciar(this);
    }

    public void pausar() {
        estado.pausar(this);
    }

    public void retomar() {
        estado.retomar(this);
    }

    public void concluir() {
        estado.concluir(this);
    }

    public void falhar() {
        estado.falhar(this);
    }
}
