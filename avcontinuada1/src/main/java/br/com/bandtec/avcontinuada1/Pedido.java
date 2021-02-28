package br.com.bandtec.avcontinuada1;

public abstract class Pedido {

    // Utilizei classe abstrata porque queria que meu projeto tivesse uma relação de herança

    // Atributos
    private Integer numero; // número do pedido
    private String cliente; // a quem pertence o pedido, nome do cliente

    // Construtor
    public Pedido(Integer numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    // Métodos

    // Método abstrato
    public abstract Double calcularCusto();

    // Método toString()
    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
