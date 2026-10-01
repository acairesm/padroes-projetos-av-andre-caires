public class RodoviarioFabrica extends FreteFabrica {

    public RodoviarioFabrica(String cliente, double valorCarga) {
        super(cliente, valorCarga);
    }

    @Override
    public Frete criarFrete() {
        return new Rodoviario(cliente, valorCarga);
    }

}
