package ejr4;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServer {
    private List<User> listaUsuarios;

    public Servidor1() {
        listaUsuarios = new ArrayList<>();
    }

    @Override
    public void inicioSesion(User user) {
        listaUsuarios.add(user);
    }

    @Override
    public void atenderUsuarios() {
        for (User user: listaUsuarios) {
            System.out.println("Servidor1 sirviendo a usuario " + user.getNumero());
            user.showInfo();
        }
    }
}