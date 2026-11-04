// 20. Escribe un programa que pida el nombre, la edad y la ciudad de una persona y construya un mensaje similar a: "Lucia tiene 18 años y vive en Talavera"

import java.util.Scanner;

public class Ejercicio20{
    public static void main(String args[]){
        String N = "";
        int E;
        String C = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        N = sc.nextLine();
        System.out.print("Introduzca su edad: ");
        E = sc.nextInt();
        System.out.print("Introduzca su ciudad: ");
        C = sc.next();
        System.out.println(N + " tiene " + E + " años y vive en " + C);
    }
}
