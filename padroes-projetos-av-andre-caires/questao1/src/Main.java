public class Main {

    public static void main(String[] args) {
        System.out.println("\nContratando frete rodoviário ...");
        new RodoviarioFabrica("Ana Souza", 10000.0).contratar();

        System.out.println("\nContratando frete aéreo ...");
        new AereoFabrica("Bruno Lima", 10000.0).contratar();

        System.out.println("\nContratando frete marítimo ...");
        new MaritimoFabrica("Carla Mendes", 10000.0).contratar();
    }

}
