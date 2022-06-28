package ejr7;

public class Directores implements IUser {
    String cargo;

    public Directores(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void update(String msg) {
        System.out.println("nueva notificacion para: " + cargo);
        System.out.println(msg);
    }
}