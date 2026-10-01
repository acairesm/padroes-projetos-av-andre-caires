public class PagamentoPix implements Pagamento {
    private final double valor;

    public PagamentoPix(double valor) { this.valor = valor; }

    public String descricao() {
        return String.format("Pagamento via Pix de R$ %.2f", valor);
    }
}
