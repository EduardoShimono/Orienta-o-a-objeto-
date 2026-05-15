public class Aluno {
    String nome;
    int idade;
    void informacoes(){
        System.out.printf("""
                o nome do aluno é: %s
                a idade do aluno é: %d anos%n""", nome, idade);
    }
}
