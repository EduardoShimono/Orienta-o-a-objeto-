package br.com.alura.screenmatch.mdelos;

public class Principal {
    public static void main(String[] args) {
      Filme filme1 = new Filme();
      filme1.setNome("minha mãe é uma peça");
      filme1.setAnoDeLancamento(2010);
      filme1.setDuracaoEmMinutos(180);
      filme1.setIncluidoNoPlano(true);

      filme1.exibeFichaTecnica();
      filme1.avaliar(7);
      filme1.avaliar(10);
      filme1.avaliar(8);
        System.out.println("A média de avaliações do filme é de " + filme1.pegamedia());
        Serie serie = new Serie();
        serie.setNome("Stranger Things");
        serie.setAnoDeLancamento(2016);
        serie.setTemporadas(5);
        serie.setAtiva(false);
        serie.setEpisodiosPorTemporada(8);
        serie.setIncluidoNoPlano(true);
        Serie serie1 = new Serie();
    }
}
