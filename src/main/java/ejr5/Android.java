package ejr5;

public class Android implements IEmpresa {
    private String name;
    private String SO;

    public Android(String name) {
        this.name = name;
        SO = "Android";
    }

    @Override
    public void login() {
        System.out.println("inicio de sesion");
        System.out.println("nombre de la aplicacion: " + name);
        System.out.println("sistema operativo: " + SO);
        System.out.println();
    }

    @Override
    public void logout() {
        System.out.println("cierre de sesion");
        System.out.println("nombre de la aplicacion: " + name);
        System.out.println("sistema operativo: " + SO);
        System.out.println();
    }

    @Override
    public void reporte() {
        System.out.println("reporte");
        System.out.println("nombre de la aplicacion: " + name);
        System.out.println("aistema operativo: " + SO);
        System.out.println();
    }
}