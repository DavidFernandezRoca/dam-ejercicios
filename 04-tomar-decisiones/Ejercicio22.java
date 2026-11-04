// 22. Escribe un programa que pida la edad de una persona e indique si es mayor o menor de edad.

import java.util.Scanner;

public class Ejercicio22{
    public static void main (String args[]){
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();
        if (edad < 18)
            System.out.println("Eres menor de edad");
        else
            System.out.println("Eres mayor de edad");
    }
}
