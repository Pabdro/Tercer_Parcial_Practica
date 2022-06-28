package ejr4;

public class Proxy implements IServer {
    private IServer servidor1;
    private IServer servidor2;

    public Proxy() {
        System.out.println("proxy iniciando");
        System.out.println();
        servidor1 = new Servidor1();
        servidor2 = new Servidor2();
    }

    public void inicioSesion(User user){
        if(user.getNumero() % 2 == 0){
            servidor1.inicioSesion(user);
        } else {
            servidor2.inicioSesion(user);
        }
    }

    @Override
    public void atenderUsuarios() {
        servidor1.atenderUsuarios();
        servidor2.atenderUsuarios();
    }
}