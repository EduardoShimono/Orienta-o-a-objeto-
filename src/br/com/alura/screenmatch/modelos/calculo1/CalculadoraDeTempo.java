package br.com.alura.screenmatch.modelos.calculo1;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
