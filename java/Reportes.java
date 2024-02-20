package solid.java;

/* clase de alto nivel, es el encargado de administrar estas clases  */
public class Reportes {

    private final Generador generador;

    public Reportes(Generador generador) {
        this.generador = generador;
    }

    public void Generador() {

        generador.Exportar();
    }

}
