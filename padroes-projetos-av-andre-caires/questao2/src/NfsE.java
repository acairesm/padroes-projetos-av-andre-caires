public class NfsE implements ComprovanteFiscal {
    private final double valor;

    public NfsE(double valor) { this.valor = valor; }

    @Override
    public String descricao() {
        return String.format("NFS-e - valor R$ %.2f, ISS 5%%: R$ %.2f", valor, valor * 0.05);
    }
}
