package ejr2;

public class Aplicacion implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println("pagando");
        double descuento = monto - monto*0.1;
        System.out.println("precio total: " + monto + " Bs");
        System.out.println("precio con descuento: " + descuento + " Bs");
        System.out.println();
    }
}