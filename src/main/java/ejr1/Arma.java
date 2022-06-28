package ejr1;

import java.util.Random;

public class Arma extends Habilidades {
    private String[] armas = {"espada", "hacha", "escopeta"};

    public Arma(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("aumentando arma al personaje");
        int nroArma = new Random().nextInt(3);
        personaje.setArmas(armas[nroArma]);
        double nuevoAtaque = personaje.getPuntosAtaque() + 30;
        personaje.setPuntosAtaque(nuevoAtaque);
        int nuevoNivel = personaje.getNivel() * 2;
        personaje.setNivel(nuevoNivel);
        personaje.showInfo();
    }
}