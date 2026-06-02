package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.modelos.calculo1.Classificavel;
import org.w3c.dom.ls.LSOutput;

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

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
