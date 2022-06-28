package ejr6;

public class Computadora implements IDispositivo {
    private String modelo;
    private int memoria;

    public Computadora(String modelo, int memoria) {
        this.modelo = modelo;
        this.memoria = memoria;
    }

    @Override
    public void showInfo() {
        System.out.println("informacion de la computadora");
        System.out.println("modelo: " + modelo);
        System.out.println("memoria: " + memoria + " GB");
        System.out.println();
    }
}