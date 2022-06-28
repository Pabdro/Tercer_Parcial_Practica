package ejr7;

public class Client {
    public static void main(String[] args){
        ServicioTecnico servicio = new ServicioTecnico();

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repararLaptop(new Laptop("Pequeño", 1000));
            }
        });

        hilo1.start();

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repararTablet(new Tablet("Mediano", 250));
            }
        });

        hilo2.start();

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                servicio.repararComputadora(new Computadora("Grande", 1500));
            }
        });

        hilo3.start();
    }
}