package Composicao;

import java.time.LocalDateTime;

public class PedidoApp {
    public static void main(String[] args){
        Pedido ped1 = new Pedido(1, LocalDateTime.now(), "Maria Clara");
        ped1.adiconaItemPedido("Bola de basquete", 400, 1);
        ped1.adiconaItemPedido("Raquete BT", 1200, 2);
        ped1.adiconaItemPedido("Luva de box", 1500, 1);

        ped1.exibeItens();
        System.out.println("Valor total do pedido: " + ped1.getValor());
    }
}
