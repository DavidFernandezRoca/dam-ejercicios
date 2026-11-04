// 29. Escribe un programa que pida tres números y los muestre ordenados de menor a mayor

import java.util.Scanner;

public class Ejercicio29{
    public static void main (String args[]){
        int pnum;
        int snum;
        int tnum;
        int aux;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        pnum = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        snum = sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        tnum = sc.nextInt();
        if (pnum < snum) {
            aux = pnum;
            pnum = snum;
            snum = aux;
        }
        if (snum < tnum) {
            aux = snum;
            snum = tnum;
            tnum = aux;
        }
        if (pnum < snum) {
            aux = pnum;
            pnum = snum;
            snum = aux;
        }
        System.out.println("De mayor a menor: " + pnum + ", " + snum + ", " + tnum);
    }
}
