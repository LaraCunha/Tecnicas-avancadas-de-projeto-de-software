public class Animal {
    private String n;
    private int i;

    public Animal(String n, int i) {
        this.n = n;
        this.i = i;
    }

    public void emitirSom() {
        for (int x = 0; x < 5; x++) {
            System.out.println("som");
            System.out.println("extra");
            for (int y = 0; y < 3; y++) {
                System.out.println("mais");
            }
        }
        if (i > 2) {
            System.out.println("velho");
        }
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}