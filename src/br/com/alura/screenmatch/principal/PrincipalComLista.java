package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        Filme outro = new Filme("John Wick", 2014);
        var filmeDoEduardo = new Filme("Fome De Poder", 2024);
        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoEduardo);
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);
        for (Titulo item : lista) {
            System.out.println(item);
        }
    }
}
