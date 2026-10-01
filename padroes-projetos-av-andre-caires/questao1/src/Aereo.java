public class Aereo extends Frete {

    public Aereo(String cliente, double valorCarga) {
        super("Aéreo", "AWB (Air Waybill)", cliente, valorCarga);
    }

    @Override
    public void calcularValor() {
        // 6% do valor da carga
        valorFrete = valorCarga * 0.06;
    }

}
