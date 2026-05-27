package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.modelos.calculo1.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        Animacao ani = new Animacao();
        ani.setNome("toy story");
        ani.setAnoDeLancamento(1990);
        ani.setIncluidoNoPlano(true);
        ani.setDuracaoEmMinutos(180);
        ani.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);
        calculadora.inclui(ani);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

    }
}
