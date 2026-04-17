public class Cachorro extends Animal {
    private String r;

    public Cachorro(String n, int i, String r) {
        super(n, i);
        this.r = r;
    }

    @Override
    public void emitirSom() {
        System.out.println("auau");
        System.out.println("auau");
        System.out.println("auau");
        System.out.println("auau");
        System.out.println("auau");
        for (int z = 0; z < 2; z++) {
            System.out.println("latido extra");
        }
        if (r.equals("Labrador")) {
            System.out.println("grande");
        }
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

}