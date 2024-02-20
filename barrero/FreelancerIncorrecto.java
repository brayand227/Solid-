package solid.java;

public class FreelancerIncorrecto implements TrabajadorIncorrecto {
    
    @Override
    public void trabajar() {
        System.out.println("Trabajando de forma independiente.");
    }

    @Override
    public void descansar() {
        // Este método no es relevante para Freelancer, pero se ve obligado a implementarlo
        System.out.println("Descansando de forma independiente.");
    }
}
