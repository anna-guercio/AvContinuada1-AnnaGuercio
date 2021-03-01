package br.com.bandtec.avcontinuada1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PedidosController {

    private List<Pedido> listaPedidos = new ArrayList<Pedido>();

    @GetMapping("/add-lanche")
    public List<Pedido> addLanche(){
        listaPedidos.add(new Lanche(101, "Anna", "Quarterao", 2, 20.00));
        return listaPedidos;
    }

    @GetMapping("/add-bebida/{numero}/{cliente}/{tipo}/{tamanho}/{quantidade}/{preco}")
    public List<Pedido> addBebida(@PathVariable Integer numero,
                                  @PathVariable String cliente,
                                  @PathVariable String tipo,
                                  @PathVariable String tamanho,
                                  @PathVariable Integer quantidade,
                                  @PathVariable Double preco){
        listaPedidos.add(new Bebida(numero,cliente,tipo,tamanho,quantidade,preco));
        return listaPedidos;
    }

}
