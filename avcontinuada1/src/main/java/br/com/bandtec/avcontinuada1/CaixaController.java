package br.com.bandtec.avcontinuada1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lanchonete")
public class CaixaController {

    // Atributos
    private String atendente;
    //    private Boolean acessos = false;
    private List<Pedido> listaPedidos = new ArrayList<>();


    // Construtor
    public CaixaController() {
        this.atendente = atendente;
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

    // ----------------------------

    private Boolean acessou = false;

    @GetMapping
    public List<Pedido> getTodosPedidos() {
        if (!acessou) {
            listaPedidos.add(new Lanche(1, "Bruna", "Quarteirao", 1, 10.00));
            listaPedidos.add(new Lanche(2, "Rafael", "Mc Duplo", 3, 30.00));
            listaPedidos.add(new Bebida(5, "Lucas", "Suco", "médio", 2, 8.00));
            listaPedidos.add(new Bebida(6, "Leo", "Refri", "grande", 1, 5.00));
            acessou = true;
            return listaPedidos;
        } else {
            return listaPedidos;
        }
    }

    @GetMapping("/ver-pedido/{numeropedido}")
    public Pedido getPedidos(@PathVariable int numeropedido) {
        if (numeropedido < listaPedidos.size()) {
            return listaPedidos.get(numeropedido - 1);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{posicao}")
    public String deleteLanche(@PathVariable int posicao) {
        if (posicao < listaPedidos.size()) {
            listaPedidos.remove(posicao - 1);
            return "O item " + posicao + " foi excluído!";
        } else {
            return "Erro! Não foi encontrado o pedido selecionado";
        }
    }


    @PostMapping
    public String postLanches(@RequestBody Lanche novoLanche) {
        listaPedidos.add(novoLanche);
        return "Pedido realizado! Seu lanche está sendo preparado :)";
    }
}


