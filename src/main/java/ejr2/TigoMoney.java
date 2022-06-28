package ejr2;

public class TigoMoney implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println("pagando con TigoMoney");
        double descuento = monto - monto*0.02;
        System.out.println("precio total: " + monto + " Bs");
        System.out.println("precio con descuento: " + descuento + " Bs");
        System.out.println();
    }
}