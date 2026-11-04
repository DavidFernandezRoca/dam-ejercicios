// 30. Escribe un programa que pida una hora (segundos, minutos y horas) y la corrija si algún valor supera su límite.

import java.util.Scanner;

public class Ejercicio30{
    public static void main(String args[]){
        int SS = 00;
        int MM = 00;
        int HH = 00;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los segundos: ");
        SS = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        MM = sc.nextInt();
        System.out.print("Introduce las horas: ");
        HH = sc.nextInt();

        if( SS >= 60){
            MM++;
            SS = 00;
        }
        if( MM >= 60){
            HH++;
            MM = 00;
        }
        if( HH >= 24){
            HH = 00;
        }
        System.out.print(HH + ":" + MM + ":" + SS);
    }
}
