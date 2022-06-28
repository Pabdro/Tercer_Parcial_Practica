package ejr7;

public class Cuenta {
    private static Cuenta cuenta;
    private int saldo;

    private Cuenta(){
        saldo = 0;
        System.out.println();
        System.out.println("inicial saldo: " + saldo);
    }

    private synchronized static void  multiThreadControl(){
        if (cuenta == null)
            cuenta = new Cuenta();
    }

    public static Cuenta getInstance(){
        if(cuenta == null)
            multiThreadControl();
        return cuenta;
    }

    public synchronized void pagar(int cantidad){
        saldo = saldo + cantidad;
        System.out.println("pagando " + cantidad + " Bs");
        System.out.println("saldo actual: " + saldo);
        System.out.println();
    }
}