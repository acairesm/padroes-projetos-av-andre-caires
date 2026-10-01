public class Rodoviario extends Frete {

    public Rodoviario(String cliente, double valorCarga) {
        super("Rodoviário", "CT-e e MDF-e", cliente, valorCarga);
    }

    @Override
    public void calcularValor() {
        // 2% do valor da carga
        valorFrete = valorCarga * 0.02;
    }

}
