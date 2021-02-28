package br.com.bandtec.avcontinuada1;

import java.util.ArrayList;
import java.util.List;

public class Caixa {

    // Atributos
    private String atendente;
    private List<Pedido> listaPedidos;

    // Construtor
    public Caixa() {
        this.atendente = atendente;
        listaPedidos = new ArrayList<Pedido>();
    }


    // Métodos

    // Adicionar um pedido
    public void adicionarPedido(Pedido p) {
        listaPedidos.add(p);
    }

    // Exibir todos os pedidos
    public void exibirPedidos() {
        System.out.println(listaPedidos);
    }

    // Exibir os pedidos de bebidas
    public void exibirBebidas() {
        System.out.println(listaPedidos);
    }
}
