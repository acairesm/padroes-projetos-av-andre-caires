public class Assinatura {
    private final FabricaArtefatos fabrica;

    public Assinatura(FabricaArtefatos fabrica) {
        this.fabrica = fabrica;
    }

    public void ativar(String cliente, double valor) {
        ComprovanteFiscal comprovante = fabrica.criarComprovanteFiscal(valor);
        Pagamento pagamento = fabrica.criarPagamento(valor);
        TermoPrivacidade termo = fabrica.criarTermoPrivacidade();

        System.out.println("===== ASSINATURA ATIVADA: " + cliente + " =====");
        System.out.println("Comprovante fiscal: " + comprovante.descricao());
        System.out.println("Pagamento: " + pagamento.descricao());
        System.out.println("Privacidade: " + termo.descricao());
        System.out.println();
    }
}
