// 9. Escribe un programa que pida la base y la altura de un triángulo y calcule su área.

import java.util.Scanner;

public class Ejercicio9{
    public static void main(String args[]){
        double base;
        double altura;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime la base y la altura del triángulo");
        base = leer.nextDouble();
        altura = leer.nextDouble();
        System.out.println("El área es: " + ((base * altura) / 2));
    }
}
