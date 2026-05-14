public class quinto {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Honda Fit";
        carro1.anoDelancamento = 2010;
        carro1.cor = "cinza";

        carro1.fichatecnica();
        carro1.calcular();
    }
}
