// 8. Escribe un programa que pida la base y la altura de un rectángulo y calcule su área.

import java.util.Scanner;

public class Ejercicio8{
    public static void main(String args[]){
        double base;
        double altura;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime la base y la altura del rectángulo");
        base = leer.nextDouble();
        altura = leer.nextDouble();
        System.out.println("El área es: " + (base * altura));
    }
}
