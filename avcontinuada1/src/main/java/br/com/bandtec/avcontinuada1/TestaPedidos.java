package br.com.bandtec.avcontinuada1;

public class TestaPedidos {

    public static void main(String[] args) {

        // Criação dos objetos das classes Lanche e Bebida
        Lanche l = new Lanche(100, "Anna", "Mc Chicken", 2, 20.00);
        Bebida b = new Bebida(101, "Gabriel", "Refrigerante", "médio",
                3, 10.00);

        // Exibir os dados dos objetos
        System.out.println(l);
        System.out.println(b);
    }
}
