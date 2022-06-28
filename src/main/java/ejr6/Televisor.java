package ejr6;

public class Televisor implements IDispositivo {
    private String modelo;
    private int size;

    public Televisor(String modelo, int size) {
        this.modelo = modelo;
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("informacion del telefono");
        System.out.println("modelo: " + modelo);
        System.out.println("tamanio: " + size + " pulgadas");
        System.out.println();
    }
}