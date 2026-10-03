// 11. Escribe un programa que pida el radio de un círculo y calcule su área. Utiliza una constante para representar el número π.

import java.util.Scanner;

public class Ejercicio11{
    public static void main(String args[]){
        double radio;
        final double π = 3.14159;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el radio del circulo");
        radio = leer.nextDouble();
        System.out.println("El área es: " + (π * radio * radio));
    }
}
