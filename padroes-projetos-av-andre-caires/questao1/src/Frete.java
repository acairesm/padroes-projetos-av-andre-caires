public abstract class Frete {

    protected String modalidade;
    protected String documentosExigidos;
    protected String cliente;
    protected double valorCarga;
    protected double valorFrete;

    public Frete(String modalidade, String documentosExigidos, String cliente, double valorCarga) {
        this.modalidade = modalidade;
        this.documentosExigidos = documentosExigidos;
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    public abstract void calcularValor();

    public void imprimirResumo() {
        System.out.println("===== RESUMO DO FRETE =====");
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor do frete: R$ " + String.format("%.2f", valorFrete));
        System.out.println("Documentos exigidos: " + documentosExigidos);
    }

}
