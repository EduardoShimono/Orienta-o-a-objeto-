public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Perdido em Marte";
        filme1.anoDeLancamento = 2016;
        filme1.duracaoEmMinutos = 190;
        filme1.incluidoNoPlano = true;

        filme1.exibeFichaTecnica();
        filme1.avaliar(8);
        filme1.avaliar(5);
        filme1.avaliar(10);
        System.out.println("a média de avaliações do filme é de " + filme1.pegamedia());
    }
}
