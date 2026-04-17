public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Genérico", 5);
        animal.emitirSom();

        Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");
        cachorro.emitirSom();

        Gato gato = new Gato("Whiskers", 2, true);
        gato.emitirSom();

        Vaca vaca = new Vaca("Bessie", 4, 500.0);
        vaca.emitirSom();
    }
}