// 25. Escribe un programa que pida una nota numérica e indique si el alumno está aprobado o suspenso.

import java.util.Scanner;

public class Ejercicio25{
    public static void main (String args[]){
        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota: ");
        nota = sc.nextDouble();
        if (nota >= 5)
            System.out.println("Has aprobado");
        else
            System.out.println("Has suspendido");
    }
}
