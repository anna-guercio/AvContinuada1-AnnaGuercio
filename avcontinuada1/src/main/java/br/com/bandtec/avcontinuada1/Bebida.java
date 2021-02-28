package br.com.bandtec.avcontinuada1;

public class Bebida extends Pedido{

    // Atributos
    private String tipo; // o tipo pode ser refrigerante, suco, água...
    private String tamanho; // tamanho pequeno, médio ou grande
    private Integer quantidade;
    private Double preco;

    // Construtor
    public Bebida(Integer numero, String cliente, String tipo, String tamanho, Integer quantidade, Double preco) {
        super(numero, cliente);
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos

    // Método abstrato
    @Override
    public Double calcularCusto() {
        // Se a quantidade de bebidas for maior ou igual a 3, aplicar um desconto de 10%
        if (quantidade >= 3){
            return (preco*quantidade)-(preco*quantidade*0.10);
        } else {
            return preco*quantidade;
        }
    }

    // Método toString()
    @Override
    public String toString() {
        return "Bebida{" +
                "tipo='" + tipo + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", custo final=" + calcularCusto() +
                '}'; // super ToString ?
    }
}
