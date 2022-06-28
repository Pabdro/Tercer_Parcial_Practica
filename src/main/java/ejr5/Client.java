package ejr5;

public class Client {
    public static void main(String[] args){
        IEmpresa android = new Android("aplicacion android");
        android.login();

        IEmpresa ios = new IOS("aplicacion IOS");
        ios.logout();

        IEmpresa windowsP = new Android("aplicacion windows");
        windowsP.reporte();

        IEmpresa web = new Artefacto(new AplicacionWeb("aplicacion web"));
        web.login();

        IEmpresa escritorio = new Artefacto(new EscritorioAplicacion("aplicacion de escritorio"));
        escritorio.logout();
    }
}