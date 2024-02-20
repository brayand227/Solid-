package solid.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Empleado empleado = new Empleado();
        empleado.trabajar();
        empleado.descansar();
        Freelancer freelancer = new Freelancer();
        freelancer.trabajar();
    }
}
