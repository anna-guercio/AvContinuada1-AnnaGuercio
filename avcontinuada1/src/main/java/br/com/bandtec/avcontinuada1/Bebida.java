package br.com.bandtec.avcontinuada1;

public class Bebida extends Pedido{

    // Atributos
    private String tipo; // o tipo pode ser refrigerante, suco, água...
    private String tamanho; // tamanho pequeno, médio ou grande
    private Integer quantidade;
    private Double valor;

    // Construtor
    public Bebida(Integer numero, String cliente, String tipo, String tamanho, Integer quantidade, Double valor) {
        super(numero, cliente);
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }


    // Métodos

    // Método abstrato da classe abstrata Pedido
    @Override
    public Double calcularPreco() {
        // Se a quantidade de bebidas for maior ou igual a 3, aplicar um desconto de 15%
        Double custo = valor*quantidade;
        if (quantidade >= 3){
            return (custo)-(custo*0.15);
        } else {
            return custo;
        }
    }

    // Método abstrato da interface Tributavel
    // O valor do tributo cobrado da bebida é de 5%
    @Override
    public Double getValorTributo() {
        return calcularPreco() * 0.05;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Bebida{" +
                "tipo='" + tipo + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", quantidade=" + quantidade +
                ", preço=" + calcularPreco() +
                ", tributo="+getValorTributo()+
                '}';
    }

    // Método Get

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }
}
