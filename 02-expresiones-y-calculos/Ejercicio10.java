// 10. Escribe un programa que pida el radio de una circunferencia y calcule su longitud. Utiliza una constante para representar el número π.

import java.util.Scanner;

public class Ejercicio10{
    public static void main(String args[]){
        double radio;
        final double π = 3.14159;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el radio del circulo");
        radio = leer.nextDouble();
        System.out.println("La longitud es: " + (2 * π * radio));
    }
}
