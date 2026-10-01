public abstract class Frete {

    protected String modalidade;
    protected String documentosExigidos;
    protected String cliente;
    protected double valorCarga;
    protected double valorFrete;

    // cada modalidade passa seu nome e seus documentos
    public Frete(String modalidade, String documentosExigidos, String cliente, double valorCarga) {
        this.modalidade = modalidade;
        this.documentosExigidos = documentosExigidos;
        this.cliente = cliente;
        this.valorCarga = valorCarga;
    }

    // cada modalidade tem seu percentual (RF01, RF02, RF03)
    public abstract void calcularValor();

    // resumo igual para todas as modalidades (RF04)
    public void imprimirResumo() {
        System.out.println("===== RESUMO DO FRETE =====");
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor do frete: R$ " + String.format("%.2f", valorFrete));
        System.out.println("Documentos exigidos: " + documentosExigidos);
    }

}
