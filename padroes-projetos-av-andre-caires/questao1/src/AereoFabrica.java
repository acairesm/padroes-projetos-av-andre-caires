public class AereoFabrica extends FreteFabrica {

    public AereoFabrica(String cliente, double valorCarga) {
        super(cliente, valorCarga);
    }

    @Override
    public Frete criarFrete() {
        return new Aereo(cliente, valorCarga);
    }

}
