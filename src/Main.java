public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Generico", 5);
        a1.emitirSom();
        System.out.println("feito");

        Cachorro c1 = new Cachorro("Rex", 3, "Labrador");
        c1.emitirSom();
        System.out.println("cachorro ok");

        Gato g1 = new Gato("Whiskers", 2, true);
        g1.emitirSom();
        g1.metodoGato();
        System.out.println("gato ok");

        Vaca v1 = new Vaca("Bessie", 4, 500.0);
        v1.emitirSom();
        v1.metodoVaca();
        System.out.println("vaca ok");

        Animal a2 = new Cachorro("Buddy", 1, "Poodle");
        a2.emitirSom();
        System.out.println("outro cachorro");

        Gato g2 = new Gato("Miau", 5, false);
        g2.emitirSom();
        System.out.println("outro gato");

        Animal a3 = new Animal("Outro", 10);
        a3.emitirSom();
        System.out.println("mais um");

        Cachorro c2 = new Cachorro("Max", 2, "Bulldog");
        c2.emitirSom();
        System.out.println("mais cachorro");

    }
}