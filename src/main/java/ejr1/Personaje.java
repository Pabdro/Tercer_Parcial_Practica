package ejr1;

public class Personaje {
    private String nombre;
    private int nivel;
    private String armas;
    private double porcentajeArmadura;
    private double puntosAtaque;
    private double puntosDefensa;
    private double puntosVida;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String isArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public double getPorcentajeArmadura() {
        return porcentajeArmadura;
    }

    public void setPorcentajeArmadura(double porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public double getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(double puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void showInfo(){
        System.out.println("informacion del personaje");
        System.out.println("nombre: " + nombre);
        System.out.println("nivel: " + nivel);
        System.out.println("armas: " + armas);
        System.out.println("porcentaje de escudo: " + porcentajeArmadura);
        System.out.println("puntos de ataque: " + puntosAtaque);
        System.out.println("puntos de defensa: " + puntosDefensa);
        System.out.println("puntos de vida: " + puntosVida);
        System.out.println();
    }
}