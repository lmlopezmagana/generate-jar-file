package net.openwebinars.calc.app;

import net.openwebinars.calc.Calculadora;
import net.openwebinars.calc.CalculadoraImpl;

public class App {

    public static void main(String[] args) {

        Calculadora c = new CalculadoraImpl();

        System.out.println("Suma de 1.2 + 3.4 = " + c.suma(1.2, 3.4));
        System.out.println("División de 2.3 / 1.2 = " +  c.divide(2.3, 1.2));

    }


}
