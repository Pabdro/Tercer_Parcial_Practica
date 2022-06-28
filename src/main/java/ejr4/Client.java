package ejr4;

public class Client {
    public static void main(String[] args){
        IServer proxy = new Proxy();
        proxy.inicioSesion(new User("marcoantonioxo", 1));
        proxy.inicioSesion(new User("danielapro", 2));
        proxy.inicioSesion(new User("gamerabysm", 3));
        proxy.inicioSesion(new User("marcosHT4", 4));

        proxy.atenderUsuarios();
    }
}