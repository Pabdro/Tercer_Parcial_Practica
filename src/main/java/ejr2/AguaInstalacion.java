package ejr2;

public class AguaInstalacion implements Iinstalacion {
    private IPago pago;
    private int precio;

    public AguaInstalacion(int precio) {
        this.precio = precio;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    @Override
    public void pagarInstalacion() {
        System.out.println("instalacion de agua");
        pago.pagar(precio);
    }
}