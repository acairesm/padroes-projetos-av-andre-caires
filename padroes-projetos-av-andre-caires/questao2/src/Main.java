public class Main {
    public static void main(String[] args) {
        new Assinatura(new FabricaBrasil()).ativar("Empresa Brasileira Ltda", 1000.0);
        new Assinatura(new FabricaMexico()).ativar("Empresa Mexicana S.A.", 1000.0);
    }
}
