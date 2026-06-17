package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avaliar(9);
        Filme outro = new Filme("John Wick", 2014);
        outro.avaliar(8);
        var filmeDoEduardo = new Filme("Fome De Poder", 2024);
        filmeDoEduardo.avaliar(10);
        Serie serie = new Serie("La Casa de Papel", 2017);

        Filme f1 = filmeDoEduardo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoEduardo);
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + ((Filme) item).getClassificacao());
            }
        }

        ArrayList<String> buscaDeArtistas = new ArrayList<>();
        buscaDeArtistas.add("Eduardo");
        buscaDeArtistas.add("John wick");
        buscaDeArtistas.add("Elton john");

        Collections.sort(buscaDeArtistas);
        System.out.println(buscaDeArtistas);
        
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento " + lista);
    }
}
