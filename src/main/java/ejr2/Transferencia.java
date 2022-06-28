package ejr2;

public class Transferencia implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println("pagando por transferencia");
        double descuento = monto - monto*0.05;
        System.out.println("precio total: " + monto + " Bs");
        System.out.println("precio con descuento: " + descuento + " Bs");
        System.out.println();
    }
}