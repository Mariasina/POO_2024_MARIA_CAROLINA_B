package Formativas.InterfaceEAbstracao.EX2;

public class PagamentoCartao implements Pagamento{
    private double valor_total;

    public PagamentoCartao(double valor_total){
        this.valor_total = valor_total;
    }

    @Override
    public String efetuarPagamento(double valor) {
        return "Pagamento no cartão realizado";
    }

    @Override
    public double calcularTroco() {
        return 0;
    }
}
