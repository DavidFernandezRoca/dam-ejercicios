// 24. Escribe un programa que lea un número entero e indique si es par o impar.

import java.util.Scanner;

public class Ejercicio24{
    public static void main (String args[]){
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        if (numero % 2 == 0)
            System.out.println("Tu numero es par");
        else
            System.out.println("Tu numero es impar");
    }
}
