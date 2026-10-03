// 7. Escribe un programa que lea dos números y muestre su suma, resta, multiplicación y división.

import java.util.Scanner;

public class Ejercicio7{
    public static void main(String args[]){
        double numero1;
        double numero2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime dos numeros");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
        System.out.println("La suma es: " + (numero1 + numero2));
        System.out.println("La resta es: " + (numero1 - numero2));
        System.out.println("La multiplicación es: " + (numero1 * numero2));
        System.out.println("La división es: " + (numero1 / numero2));
    }
}
