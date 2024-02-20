package solid.java;

public class Freelancer implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Trabajando de forma independiente.");
    }
}