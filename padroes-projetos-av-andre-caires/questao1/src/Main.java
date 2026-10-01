public class Main {

    public static void main(String[] args) {
        // Main só escolhe a fábrica; nunca instancia um frete concreto (RNF04)
        System.out.println("\nContratando frete rodoviário ...");
        new RodoviarioFabrica("Ana Souza", 10000.0).contratar();

        System.out.println("\nContratando frete aéreo ...");
        new AereoFabrica("Bruno Lima", 10000.0).contratar();

        System.out.println("\nContratando frete marítimo ...");
        new MaritimoFabrica("Carla Mendes", 10000.0).contratar();
    }

}
