package br.com.bandtec.avcontinuada1;

public class Lanche extends Pedido{

    // Atributos
    private String nome; // nome do lanche ex: BigMac, McChicken...
    private Integer quantidade;
    private Double preco;

    // Construtor
    public Lanche(Integer numero, String cliente, String nome, Integer quantidade, Double preco) {
        super(numero, cliente);
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos

    // Método abstrato
    @Override
    public Double calcularCusto() {
        return preco*quantidade;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Lanche{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", custo final=" + calcularCusto() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }
}
