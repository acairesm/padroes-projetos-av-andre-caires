public class MaritimoFabrica extends FreteFabrica {

    public MaritimoFabrica(String cliente, double valorCarga) {
        super(cliente, valorCarga);
    }

    @Override
    public Frete criarFrete() {
        return new Maritimo(cliente, valorCarga);
    }

}
