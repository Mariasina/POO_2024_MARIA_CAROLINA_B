package Formativas.InterfaceEAbstracao.EX2;

public class Main {
    public static void main(String[] args) {
        PagamentoCartao compra1 = new PagamentoCartao(200.20);
        PagamentoDinheiro compra2 = new PagamentoDinheiro(150.50);

        System.out.println(compra1.efetuarPagamento(200.20));
        System.out.printf("Valor de troco: %f \n\n", compra1.calcularTroco());

        System.out.println(compra2.efetuarPagamento(160.20));
        System.out.printf("Valor de troco: %f \n\n", compra2.calcularTroco());
    }

}
