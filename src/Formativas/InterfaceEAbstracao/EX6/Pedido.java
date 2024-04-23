package Formativas.InterfaceEAbstracao.EX6;

public class Pedido {
    private String cliente;
    private int num_pedido;
    private ItemPedido item;

    public Pedido(String cliente, int num_pedido, ItemPedido item){
        this.cliente = cliente;
        this.num_pedido = num_pedido;
        this.item = item;
    }

    public Pedido(int num_pedido, String nome_produto){
        this.num_pedido = num_pedido;
        this.item = new ItemPedido(nome_produto);
    }


}
