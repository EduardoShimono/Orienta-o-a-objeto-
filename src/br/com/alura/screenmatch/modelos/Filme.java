package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculo1.Classificavel;

public class Filme extends Titulo implements Classificavel {
private String diretor;

    public Filme(String nome, int AnoDeLancamento){
        super(nome, AnoDeLancamento);
    }

    @Override
    public int getClassificacao() {
        return (int) pegamedia() / 2;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


}
