public class FabricaBrasil implements FabricaArtefatos {
    @Override
    public ComprovanteFiscal criarComprovanteFiscal(double valor) { return new NfsE(valor); }
    @Override
    public Pagamento criarPagamento(double valor) { return new PagamentoPix(valor); }
    @Override
    public TermoPrivacidade criarTermoPrivacidade() { return new TermoLgpd(); }
}
