package ejr2;

public class AlcantarilladoInstalacion implements Iinstalacion {
    private IPago pago;
    private int precio;

    public AlcantarilladoInstalacion(int precio) {
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
        System.out.println("instalacion de alcantarillado");
        pago.pagar(precio);
    }
}