package ejr1;

public class Client {
    public static void main (String []args){
        Personaje p1 = new Personaje("El rey de la reencarnacion, Escanor");

        IJuego warcraft = new Warcraft();
        warcraft.crearPersonaje(p1);

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new Escudo(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new Curacacion(warcraft);
        warcraft.agregarHabilidad(p1);

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(p1);
    }
}