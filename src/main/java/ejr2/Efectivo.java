package ejr2;

public class Efectivo implements IPago {

    @Override
    public void pagar(int monto) {
        System.out.println("pagando en efectivo");
        System.out.println("precio total: " + monto);
        System.out.println();
    }
}