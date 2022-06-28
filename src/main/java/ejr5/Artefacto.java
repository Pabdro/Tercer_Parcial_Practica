package ejr5;

public class Artefacto implements IEmpresa {
    private IEmpresaApp empresaApp;

    public Artefacto(IEmpresaApp artefacto) {
        this.empresaApp = artefacto;
    }

    @Override
    public void login() {
        empresaApp.iniciarSesion();
    }

    @Override
    public void logout() {
        empresaApp.cerrarSesion();
    }

    @Override
    public void reporte() {
        empresaApp.generarDatos();
    }
}