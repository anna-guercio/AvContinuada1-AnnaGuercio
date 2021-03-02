package br.com.bandtec.avcontinuada1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lanchonete")
public class CaixaController {

    // Atributos
    private String atendente;
    private List<Pedido> listaPedidos;

    // Construtor
    public CaixaController() {
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


    // --------------------

    // c) Os Endpoints devolvem uma lista de JSON criada a partir de uma lista na classe Controller
    // A lista é do tipo da classe abstrata
    Lanche l = new Lanche(1,"Bruna","Quarteirao", 1, 10.00);
    Lanche l2 = new Lanche(2,"Rafael","Mc Duplo", 3, 30.00);
    Lanche l3 = new Lanche(3,"Tiago","Mc Fish", 5, 15.00);

    Bebida b = new Bebida(1, "Gabriel", "Água", "pequeno", 1, 5.00);
    Bebida b2 = new Bebida(2, "Lucas", "Suco", "médio", 2, 8.00);
    Bebida b3 = new Bebida(3, "Leonardo", "Refrigerante", "grande", 4, 7.00);


    // b) Consulta utilizando método GET
    @GetMapping
    public String padrao() {
        return "Bem Vindo ao McDonalds, qual vai ser o seu pedido?";
    }

    // b) Consulta com path param
    @GetMapping("/add-lanche/{numero}/{cliente}/{nome}/{quantidade}/{valor}")
    public List<Pedido> addLanche(@PathVariable Integer numero,
                                  @PathVariable String cliente,
                                  @PathVariable String nome,
                                  @PathVariable Integer quantidade,
                                  @PathVariable Double valor) {
            listaPedidos.add(new Lanche(numero, cliente, nome, quantidade, valor));
            return listaPedidos;
    }





}
