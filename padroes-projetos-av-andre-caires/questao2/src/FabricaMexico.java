// ConcreteFactory
public class FabricaMexico implements FabricaArtefatos {
    public ComprovanteFiscal criarComprovanteFiscal(double valor) { return new Cfdi(valor); }
    public Pagamento criarPagamento(double valor) { return new PagamentoSpei(valor); }
    public TermoPrivacidade criarTermoPrivacidade() { return new TermoLfpdppp(); }
}
