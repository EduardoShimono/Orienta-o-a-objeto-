public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica (){
        System.out.println("O nome do filme é " + nome);
        System.out.println("O ano de lançamento é " + anoDeLancamento);
        System.out.println("a duração do filme em minutos é de " + duracaoEmMinutos);
        System.out.println("Incluido no plano:" + incluidoNoPlano);
    }
    void avaliar (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double pegamedia () { return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
