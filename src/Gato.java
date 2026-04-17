public class Gato extends Animal {

    private boolean arranha;

    public Gato(String nome, int idade, boolean arranha) {
        super(nome, idade);
        this.arranha = arranha;
    }

    @Override
    public void emitirSom() {

        System.out.println("Miau");

        if (arranha) {
            System.out.println("Arranha");
        } else {
            System.out.println("Não arranha");
        }
    }
}