// 23. Escribe un programa que lea dos números y muestre cuál de ellos es mayor.

import java.util.Scanner;

public class Ejercicio23{
    public static void main (String args[]){
        int pnum;
        int snum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        pnum = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        snum = sc.nextInt();
        if (pnum > snum)
            System.out.println(pnum + " es el mayor");
        else
            System.out.println(snum + " es el mayor");
    }
}
