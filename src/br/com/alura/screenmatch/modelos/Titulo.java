package br.com.alura.screenmatch.modelos;

public class Titulo {
    String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica (){
        System.out.println("O nome do titulo é " + nome);
        System.out.println("O ano de lançamento é " + anoDeLancamento);
        System.out.println("a duração do titulo em minutos é de " + duracaoEmMinutos);
        System.out.println("Incluido no plano:" + incluidoNoPlano);
    }
    public void avaliar (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegamedia () { return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public int getDuracaoEmMinutos(){
        return this.duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }
}
