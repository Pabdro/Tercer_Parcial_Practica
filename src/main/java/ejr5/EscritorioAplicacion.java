package ejr5;

public class EscritorioAplicacion implements IEmpresaApp {
    private String name;
    private String tipo;

    public EscritorioAplicacion(String name) {
        this.name = name;
        tipo = "Escritorio";
    }

    @Override
    public void iniciarSesion() {
        System.out.println("inicio de sesion");
        System.out.println("nombre de la aplicacion: " + name);
        System.out.println("tipo de aplicacion: " + tipo);
        System.out.println();
    }

    @Override
    public void cerrarSesion() {
        System.out.println("cierre de sesion");
        System.out.println("nombre de la aplicacion: " + name);
        System.out.println("tipo de aplicacion: " + tipo);
        System.out.println();
    }

    @Override
    public void generarDatos() {
        System.out.println("datos de la aplicacion");
        System.out.println("nombre de la aplicacion: " + name);
        System.out.println("tipo de aplicacion: " + tipo);
        System.out.println();
    }
}