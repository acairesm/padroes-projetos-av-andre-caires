public abstract class FreteFabrica {

    protected String cliente;
    protected double valorCarga;

    public FreteFabrica(String cliente, double valorCarga) {
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    // factory method: cada fábrica decide qual frete concreto criar (RNF02)
    public abstract Frete criarFrete();

    // procedimento escrito uma única vez e só conhece a abstração Frete (RNF01)
    // final: nenhuma fábrica nova pode alterar o procedimento
    public final void contratar() {
        Frete frete = criarFrete();
        frete.calcularValor();
        frete.imprimirResumo();
    }

}
