package Formativas.InterfaceEAbstracao.EX6;

public class Main {
    public static void main(String[] args) {
        ItemPedido produto1 = new ItemPedido("Secador");
        Pedido compra1 = new Pedido("Mari", 1, produto1);
        Pedido compra2 = new Pedido(1, "Maçã");

        System.out.println(compra1);
    }
}
