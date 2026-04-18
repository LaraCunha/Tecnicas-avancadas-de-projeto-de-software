package classes.subclasses;
import classes.Animal;

public class Vaca extends Animal {

    private double peso;

    public Vaca(String nome, int idade, double peso) {
        super(nome, idade);
        this.peso = peso;
    }

    @Override
    public void emitirSom() {

        System.out.println("Muu");

        if (ehPesada()) {
            System.out.println("Pesada");
        }
    }

    private boolean ehPesada() {
        return peso > 400;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}