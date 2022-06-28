package ejr7;

public class ServicioTecnico implements IEmpresa {
    private Pago notificacion;

    public ServicioTecnico(){
        notificacion = new Pago();
        notificacion.suscripcionDeDirectores(new Directores("presidente"));
        notificacion.suscripcionDeDirectores(new Directores("vicepresidente"));
        notificacion.suscripcionDeDirectores(new Directores("contabilidad"));
    }

    @Override
    public void repararLaptop(Laptop laptop) {
        System.out.println("reparando laptop");
        laptop.showInfo();
        pagar(laptop.getPrecio());
        notificacion.sendNotification();

    }

    @Override
    public void repararComputadora(Computadora pc) {
        System.out.println("reparando computadora");
        pc.showInfo();
        pagar(pc.getPrecio());
        notificacion.sendNotification();
    }

    @Override
    public void repararTablet(Tablet tablet) {
        System.out.println("reparando tablet");
        tablet.showInfo();
        pagar(tablet.getPrecio());
        notificacion.sendNotification();
    }

    public void pagar(int cantidad){
        Cuenta.getInstance().pagar(cantidad);
    }
}