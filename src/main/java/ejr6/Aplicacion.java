package ejr6;

import java.util.Random;

public class Aplicacion implements IVisitorAplicacion {

    @Override
    public void visitCelular(Celular celular) {
        System.out.println("se debe hacer mantenimiento al celular");
        celular.showInfo();
    }

    @Override
    public void visitComputadora(Computadora computadora) {
        if(new Random().nextInt(20) % 2 == 0){
            System.out.println("mantenimiento preventivo a la computadora");
        } else {
            System.out.println("mantenimiento correctivo a la computadora");
        }
        computadora.showInfo();
    }

    @Override
    public void visitTelevisor(Televisor televisor) {
        System.out.println("ver informacion del televisor");
        televisor.showInfo();
    }
}