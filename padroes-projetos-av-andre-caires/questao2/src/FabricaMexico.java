public class FabricaMexico implements FabricaArtefatos {
    @Override
    public ComprovanteFiscal criarComprovanteFiscal(double valor) { return new Cfdi(valor); }
    @Override
    public Pagamento criarPagamento(double valor) { return new PagamentoSpei(valor); }
    @Override
    public TermoPrivacidade criarTermoPrivacidade() { return new TermoLfpdppp(); }
}
