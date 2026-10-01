public abstract class FreteFabrica {

    protected String cliente;
    protected double valorCarga;

    public FreteFabrica(String cliente, double valorCarga) {
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    public abstract Frete criarFrete();

    public final void contratar() {
        Frete frete = criarFrete();
        frete.calcularValor();
        frete.imprimirResumo();
    }

}
