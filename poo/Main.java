package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 4);
        Figura cuadrado = new Cuadrado(3);
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}

