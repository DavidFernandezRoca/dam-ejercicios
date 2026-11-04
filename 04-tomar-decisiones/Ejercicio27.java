// 27. Escribe un programa que pida un nombre de usuario y una edad. Solo si la persona tiene 18 años o más deberá mostrar un mensaje indicando que puede acceder.

import java.util.Scanner;

public class Ejercicio27{
    public static void main (String args[]){
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        nombre = sc.next();
        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();
        if (edad < 18)
            System.out.println(nombre + " no tienes acceso, vuelve dentro de " + (18 - edad) + " años.");
        else
            System.out.println(nombre + " has accedido correctamente.");
    }
}
