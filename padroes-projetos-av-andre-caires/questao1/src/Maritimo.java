public class Maritimo extends Frete {

    public Maritimo(String cliente, double valorCarga) {
        super("Marítimo", "BL (Bill of Lading) e fatura comercial", cliente, valorCarga);
    }

    @Override
    public void calcularValor() {
        valorFrete = valorCarga * 0.01;
    }

}
