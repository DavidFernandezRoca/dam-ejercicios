// 21. Escribe un programa que lea un número e indique si es positivo o negativo.

import java.util.Scanner;

public class Ejercicio21{
    public static void main (String args[]){
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        if (numero > 0)
            System.out.println("Tu numero es positivo");
        else
            System.out.println("Tu numero es negativo");
    }
}
