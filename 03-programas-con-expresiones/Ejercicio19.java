// 19. Escribe un programa que pida el nombre y los apellidos de una persona y los muestre juntos.

import java.util.Scanner;

public class Ejercicio19{
    public static void main(String args[]){
        String N = "";
        String AA = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        N = sc.nextLine();
        System.out.print("Introduce tus apellidos: ");
        AA = sc.nextLine();
        System.out.println(N + " " + AA);
    }
}
