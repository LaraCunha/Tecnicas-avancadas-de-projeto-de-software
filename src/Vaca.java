public class Vaca extends Animal {
    private double p;

    public Vaca(String n, int i, double p) {
        super(n, i);
        this.p = p;
    }

    @Override
    public void emitirSom() {
        System.out.println("muu");
        System.out.println("muu");
        System.out.println("muu");
        System.out.println("muu");
        if (p > 400) {
            System.out.println("pesada");
        }
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void metodoVaca() {
        System.out.println("vaca muge");
    }
}