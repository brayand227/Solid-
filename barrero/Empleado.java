package solid.java;


public class Empleado implements Trabajador, Descanso{
    

    @Override
    public void trabajar(){
        System.out.println("Realizando tareas laborales");
    }

    @Override
    public void descansar(){
        System.out.println("Tomando un descanso");
    }
    
}
