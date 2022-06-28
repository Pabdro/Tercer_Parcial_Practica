package ejr4;

public class User {
    private String name;
    private int numero;

    public User(String username, int number) {
        this.name = username;
        this.numero = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void showInfo(){
        System.out.println("informacion del usuario");
        System.out.println("username: " + name);
        System.out.println("numero de usuario: " + numero);
        System.out.println();
    }
}