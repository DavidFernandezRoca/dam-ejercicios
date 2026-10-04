// 14. Escribe un programa que pida una cantidad de minutos y calcule cuántas horas completas y cuántos minutos restantes representa.

import java.util.Scanner;

public class Ejercicio14{
    public static void main(String args[]){
        int minuto;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime la cantidad de minutos: ");
        minuto = leer.nextInt();
        System.out.println("En horas son: " + (minuto / 60));
        System.out.println("Los minutos restantes son: " + (minuto % 60));
    }
}
