// 28. Escribe un programa que lea tres números y muestre cuál es el mayor.

import java.util.Scanner;

public class Ejercicio28{
    public static void main (String args[]){
        int pnum;
        int snum;
        int tnum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        pnum = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        snum = sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        tnum = sc.nextInt();
        if (pnum >= snum && pnum >= tnum)
            System.out.println(pnum + " es el mayor");
        else if (snum >= pnum && snum >= tnum)
            System.out.println(snum + " es el mayor");
        else
            System.out.println(tnum + " es el mayor");
    }
}
