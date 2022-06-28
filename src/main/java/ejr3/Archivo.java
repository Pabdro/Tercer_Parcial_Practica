package ejr3;

public class Archivo extends Component {
    private int nroDePalabras;

    public Archivo(String nombre, int nro){
        super(nombre);
        this.nroDePalabras=nro;
    }

    @Override
    public void print() {
        System.out.println("\t archivo : " + this.getName());
    }

    @Override
    public void add(Component component) {
        System.out.println("No se pueden aumentar archivos");
    }

    @Override
    public int getNroPalabras() {
        return nroDePalabras;
    }

}