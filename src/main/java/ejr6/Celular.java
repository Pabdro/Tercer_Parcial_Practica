package ejr6;

public class Celular implements IDispositivo {
    private String modelo;
    private int memoria;

    public Celular(String modelo, int memoria) {
        this.modelo = modelo;
        this.memoria = memoria;
    }

    @Override
    public void showInfo() {
        System.out.println("informacion del celular");
        System.out.println("modelo: " + modelo);
        System.out.println("memoria: " + memoria + " GB");
        System.out.println();
    }
}