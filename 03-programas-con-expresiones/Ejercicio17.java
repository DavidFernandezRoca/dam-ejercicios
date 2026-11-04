// 17. Escribe un programa que pida una temperatura expresada en grados Celsius y la convierta a grados Fahrenheit.

import java.util.Scanner;

public class Ejercicio17{
    public static void main (String args[]){
        double tempcel = 1;
        double tempfah = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura en Celsius: ");
        tempcel = sc.nextInt();
        tempfah = (tempcel * 1.8) + 32;
        System.out.println("Tu temperatura en Fahrenheit es: " + tempfah);
    }
}
