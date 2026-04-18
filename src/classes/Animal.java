package classes;
public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {

        System.out.println("Som");

        if (idade > 2) {
            System.out.println("Velho");
        }
    }
}