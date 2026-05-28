package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.modelos.calculo1.Classificavel;

public class Filme extends Titulo implements Classificavel {
private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegamedia() / 2;
    }
}
