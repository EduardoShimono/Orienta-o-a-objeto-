package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo1.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo1.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.avaliar(10);
        favorito.avaliar(7);
        favorito.avaliar(5);

        Filme outro = new Filme("John Wick", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);
        filtro.filtra(episodio);
        filtro.filtra(outro);

        var filmeDoEduardo = new Filme("Fome De Poder", 2024);
        filmeDoEduardo.setAnoDeLancamento(2024);
        filmeDoEduardo.setDuracaoEmMinutos(115);
        filmeDoEduardo.setIncluidoNoPlano(true);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filmeDoEduardo);
        filmes.add(favorito);
        filmes.add(outro);
        System.out.println("Tamanho da lista: " + filmes.size());
        System.out.println("Primeiro Filme: " + filmes.get(0).getNome());
        System.out.println(filmes);
        System.out.println(filmes.get(0).toString());
    }
}
