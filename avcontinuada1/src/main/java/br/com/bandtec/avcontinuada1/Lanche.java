package br.com.bandtec.avcontinuada1;

public class Lanche extends Pedido {

    // Atributos
    private String nome; // nome do lanche ex: BigMac, McChicken...
    private Integer quantidade;
    private Double valor;

    // Construtor
    public Lanche(Integer numero, String cliente, String nome, Integer quantidade, Double valor) {
        super(numero, cliente);
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }


    // Métodos

    // Método abstrato da classe abstrata Pedido
    @Override
    public Double calcularPreco() {
        return valor * quantidade;
    }

    // Método abstrato da interface Tributavel
    // O valor do tributo cobrado do lanche é de 10%
    @Override
    public Double getValorTributo() {
        return calcularPreco() * 0.10;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Lanche{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preço=" + calcularPreco() +
                ", tributo=" + getValorTributo() +
                '}';
    }

    // Get
    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }
}
