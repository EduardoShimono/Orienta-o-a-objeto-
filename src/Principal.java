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
    }
}
