package classes.subclasses;
import classes.Animal;

public class Vaca extends Animal {

    // Os nomes precisam ser significativos, mudei "p" para "peso"
    private double peso;

    // adicionei nomes claros para os parâmetros do construtor
    public Vaca(String nome, int idade, double peso) {
        super(nome, idade);
        this.peso = peso;
    }

    @Override
    public void emitirSom() {

        // Evitar duplicações
            System.out.println("Muu");

        // Método com nome descritivo
        if (ehPesada()) {
            System.out.println("Pesada");
        }
    }

    // Funções pequenas e com responsabilidade única
    private boolean ehPesada() {
        return peso > 400;
    }

    // Nomes consistentes e legíveis
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Remoção de métodos desnecessários ou redundantes
}