package ejr7;
import java.util.ArrayList;
import java.util.List;

public class Pago implements INotificacion {
    private  List <IUser> receivers= new ArrayList<>();

    @Override
    public void suscripcionDeDirectores(IUser user) {
        receivers.add(user);
    }

    @Override
    public void sendNotification() {
        for (IUser user : receivers) {
            user.update("pago realizado");
        }
    }
}