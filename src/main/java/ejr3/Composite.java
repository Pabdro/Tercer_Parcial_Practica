package ejr3;

import java.util.ArrayList;

public class Composite extends Component {
    private int nroDePalabras;
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(String name){
        super(name);
    }

    @Override
    public void print() {
        for (Component comp: list) {
            comp.print();
        }
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public int getNroPalabras() {
        nroDePalabras=0;
        for (Component componentes: list ) {
            nroDePalabras = nroDePalabras+componentes.getNroPalabras();
        }
        System.out.println("Nombre : "+this.getName()+ " \t  # de palabras en el archivo ---> "+this.nroDePalabras);
        return nroDePalabras;
    }
}
