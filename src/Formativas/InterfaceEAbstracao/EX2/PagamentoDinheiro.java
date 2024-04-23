package Formativas.InterfaceEAbstracao.EX2;

public class PagamentoDinheiro implements Pagamento{
    private double valor_total;
    private double valor_pago;

    public PagamentoDinheiro(double valor_total){
        this.valor_total = valor_total;
    }

    @Override
    public String efetuarPagamento(double valor) {
        valor_pago = valor;
        return "Pagamento em dinheiro realizado";
    }

    @Override
    public double calcularTroco() {
        return valor_pago - valor_total;
    }
}
