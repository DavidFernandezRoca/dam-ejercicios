// 5. Escribe un programa que pida al usuario su nombre y su edad y muestre posteriormente ambos datos.

import java.util.Scanner;

public class Ejercicio5{
    public static void main(String args[]){
        String nombre;
        int edad;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime tu nombre y tu edad");
        nombre = leer.nextLine();
        edad = leer.nextInt();
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
    }
}
