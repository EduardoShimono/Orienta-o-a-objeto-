public class Carro {
    String modelo;
    int anoDelancamento;
    String cor;

    void fichatecnica (){
        System.out.println(String.format("""
                O Modelo do seu carro é %s
                O ano de lançamento do seu carro é %d
                A cor do seu carro é %s""", modelo, anoDelancamento, cor));
    }
    void calcular(){
        int anoAtual = 2026;
        int idadeCarro = anoAtual - anoDelancamento;
        System.out.println("Idade do seu carro é " + idadeCarro + " anos");
    }
}
