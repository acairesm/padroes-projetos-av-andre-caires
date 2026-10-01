public class FabricaBrasil implements FabricaArtefatos {
    public ComprovanteFiscal criarComprovanteFiscal(double valor) { return new NfsE(valor); }
    public Pagamento criarPagamento(double valor) { return new PagamentoPix(valor); }
    public TermoPrivacidade criarTermoPrivacidade() { return new TermoLgpd(); }
}
