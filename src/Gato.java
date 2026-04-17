public class Gato extends Animal {
    private boolean t;

    public Gato(String n, int i, boolean t) {
        super(n, i);
        this.t = t;
    }

    @Override
    public void emitirSom() {
        for (int j = 0; j < 3; j++) {
            System.out.println("miau");
            System.out.println("miau");
        }
        if (t) {
            System.out.println("arranha");
        } else {
            System.out.println("nao arranha");
        }
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public void metodoGato() {
        System.out.println("gato mia");
    }
}