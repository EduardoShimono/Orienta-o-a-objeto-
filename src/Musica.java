public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDeAvaliacoes;
    int totalDeAvaliacoes;
    void fichatcnica (){
        System.out.println(String.format("""
                o titulo da musica é %s
                o artista que canta essa musica é o %s
                o ano de lançamento dessa musica foi no ano de %d
                """, titulo, artista, anoLancamento ));
    }
    void avaliar (double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    double pegamedia () {
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }
}
