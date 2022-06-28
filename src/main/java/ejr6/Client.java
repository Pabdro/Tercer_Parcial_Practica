package ejr6;

public class Client {
    public static void main(String[] args){
        Aplicacion aplicacion = new Aplicacion();
        Celular celular = new Celular("Xiaomi Redmi 10", 100);
        Computadora computadora = new Computadora("hp", 10);
        Televisor televisor = new Televisor("Sony", 18);

        aplicacion.visitCelular(celular);
        aplicacion.visitComputadora(computadora);
        aplicacion.visitTelevisor(televisor);
    }
}