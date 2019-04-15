package model;

/**
 *
 * @author Israel Barcelos
 */
public class Produto {
    /* 
     Calcular valor total do produto
     Valor com juros de 13%
     Valor com desconto de 8%
     */

    private double valor;
    private int quantidade;
    private String nome;

    public Produto() {

    }

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularValorTotal() {
        return this.valor * this.quantidade;
    }

    public double calcularValorComJuros() {
        return calcularValorTotal() * 1.13;
    }

    public double calcularValorComDesconto() {
        return calcularValorTotal() * 0.92;
    }

    public String mostrarResultados() {
        return "Produto: " + this.nome
                + "\nQuantidade: " + this.quantidade
                + "\nValor unitario: " + this.valor
                + "\nValor do produto em até 3 vezes: " + calcularValorTotal()
                + "\nValor do produto à vista: " + calcularValorComDesconto()
                + "\nValor do produto em mais de 3 vezes: " + calcularValorComJuros();
    }

    public void pulaLinha(int linhas) {
        for (int i = 0; i < linhas; i++) {
            System.out.println("");
        }
    }
}
