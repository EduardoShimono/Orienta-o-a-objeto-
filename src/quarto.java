public class quarto {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "A Morte Do Autotune";
        musica1.artista = "Matue";
        musica1.anoLancamento = 2020;
        musica1.fichatcnica();
        musica1.avaliar(10);
        musica1.avaliar(9);
        System.out.println("a media de notas dessa musica é de " + musica1.pegamedia());
    }
}
