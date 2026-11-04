// 18. Escribe un programa que pida una cantidad de segundos y determine cuántas horas, minutos y segundos representa.

import java.util.Scanner;

public class Ejercicio18{
    public static void main (String args []){
        int SS;
        int MM = 0;
        int HH = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una cantidad de segundos: ");
        SS = sc.nextInt();
        if (SS >= 60){
            MM = SS / 60;
            SS = SS % 60;
            if (MM >= 60){
                HH = MM / 60;
                MM = MM % 60;
            }
        }
        System.out.println(HH + ":" + MM + ":" + SS);
    }
}
