package ejr3;

public class Client {
    public static void main(String[] args) {
        Composite folder = new Composite("folder1");

        folder.add(new Archivo("ARCHIVO1", 7));
        folder.add(new Archivo("ARCHIVO2", 6));
        folder.add(new Archivo("ARCHIVO3", 5));

        folder.getNroPalabras();

        Composite folder2 = new Composite("folder2");
        folder2.add(new Archivo("ARCHIVO4", 1));
        folder2.add(new Archivo("ARCHIVO5", 2));
        folder2.add(new Archivo("ARCHIVO6", 1));
        folder2.add(new Archivo("ARCHIVO7", 2));
        folder2.getNroPalabras();

        Composite unidadDeDisco = new Composite("UNIDAD DE DISCO");
        unidadDeDisco.add(folder);
        unidadDeDisco.add(folder2);
        unidadDeDisco.getNroPalabras();
    }
}
