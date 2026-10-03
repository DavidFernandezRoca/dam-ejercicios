// 12. Escribe un programa que pida tres números y calcule su media aritmética.

import java.util.Scanner;

public class Ejercicio12{
    public static void main(String args[]){
        double numero1;
        double numero2;
        double numero3;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime tres números: ");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
        numero3 = leer.nextDouble();
        System.out.println("La media es: " + ((numero1 + numero2 + numero3) / 3));
    }
}
