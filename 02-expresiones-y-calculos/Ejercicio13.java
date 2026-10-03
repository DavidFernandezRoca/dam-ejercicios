// 13. Escribe un programa que pida una cantidad de horas y calcule cuántos minutos representan.

import java.util.Scanner;

public class Ejercicio13{
    public static void main(String args[]){
        int hora;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime la cantidad de horas: ");
        hora = leer.nextInt();
        System.out.println("En minutos son: " + (hora * 60));
    }
}
