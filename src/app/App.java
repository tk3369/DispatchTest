package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        App app = new App();
        Vehicle v = new Tractor();
        app.appraise(v);
    }

    public void appraise(Vehicle v) {
        System.out.println("Appraising vehicle");
    }

    public void appraise(Tractor v) {
        System.out.println("Appraising tractor");
    }
}
