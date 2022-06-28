package ejr1;

public class Curacacion extends Habilidades {
    private String[] armas = {"espada", "hacha", "escopeta"};

    public Curacacion(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("aumentando puntos de vida al personaje");
        double nuevaVida = personaje.getPuntosVida() + 80;
        personaje.setPuntosDefensa(nuevaVida);
        personaje.showInfo();
    }
}