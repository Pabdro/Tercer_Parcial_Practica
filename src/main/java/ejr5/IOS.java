package ejr5;

public class IOS implements IEmpresa {
    private String name;
    private String SO;

    public IOS(String name) {
        this.name = name;
        SO = "IOS";
    }

    @Override
    public void login() {
        System.out.println("INICIO DE SESION");
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
        System.out.println("sistema operativo: " + SO);
        System.out.println();
    }
}