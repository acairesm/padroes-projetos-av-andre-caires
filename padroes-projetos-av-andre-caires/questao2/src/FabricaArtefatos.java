public interface FabricaArtefatos {
    ComprovanteFiscal criarComprovanteFiscal(double valor);
    Pagamento criarPagamento(double valor);
    TermoPrivacidade criarTermoPrivacidade();
}
