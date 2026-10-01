// AbstractFactory: cada fábrica concreta cria os três artefatos do mesmo país (RNF01)
public interface FabricaArtefatos {
    ComprovanteFiscal criarComprovanteFiscal(double valor);
    Pagamento criarPagamento(double valor);
    TermoPrivacidade criarTermoPrivacidade();
}
