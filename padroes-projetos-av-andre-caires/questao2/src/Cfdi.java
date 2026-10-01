public class Cfdi implements ComprovanteFiscal {
    private final double valor;

    public Cfdi(double valor) { this.valor = valor; }

    public String descricao() {
        return String.format("CFDI - valor MXN %.2f, IVA 16%%: MXN %.2f", valor, valor * 0.16);
    }
}
