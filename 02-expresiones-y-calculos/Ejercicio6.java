// 6. Escribe un programa que lea dos números enteros y muestre su suma.

import java.util.Scanner;

public class Ejercicio6{
    public static void main(String args[]){
        int numero1;
        int numero2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime dos numeros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        System.out.println("La suma es: " + (numero1 + numero2));
    }
}
