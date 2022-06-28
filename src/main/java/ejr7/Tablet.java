package ejr7;

public class Tablet implements IComputadora {
    private String tamanio;
    private int precio;

    public Tablet(String size, int price) {
        this.tamanio = size;
        this.precio = price;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("informacion de la tablet");
        System.out.println("tamanio: " + tamanio);
        System.out.println("precio de la reparacion: " + precio);
    }
}