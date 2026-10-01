public class PagamentoSpei implements Pagamento {
    private final double valor;

    public PagamentoSpei(double valor) { this.valor = valor; }

    @Override
    public String descricao() {
        return String.format("Pagamento via SPEI de MXN %.2f", valor);
    }
}
