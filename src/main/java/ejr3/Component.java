package ejr3;

abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
        System.out.println("Creando " + name);
    }

    public String getName() {
        return this.name;
    }
    public abstract void print();
    public abstract void add(Component component);
    public abstract int getNroPalabras();
}
