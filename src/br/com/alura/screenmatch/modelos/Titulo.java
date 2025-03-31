package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo() {
    }

    public void fichaTecnica() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("ano de lançamento: " + this.anoDelancamento);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDelancamento() {
        return this.anoDelancamento;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public boolean isIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        ++this.totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    public double pegamedia() {
        return this.somaDasAvaliacoes / (double)this.totalDeAvaliacoes;
    }
}
