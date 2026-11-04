// crear una funcion que traduzca una cantidad de segundos a una cadena con formato "HH:MM:SS" Por ejemplo -> 30 tiene que generar 00:00:30
// el prototipo o firma de kla funcion es la cabecera de lo que hay que escribir "public static String convierteACadena(int segundos)

import java.util.Scanner;

public class SegundosAHoras{
    public static void main(String args[]){
        int SS = 0;
        int MM = 0;
        int HH = 0;
        Scanner sc = new Scanner (System.in);

        SS = sc.nextInt();
        do{
            while(SS <= 0){
                System.out.println("Introduce un valor mayor a 0.");
                SS = sc.nextInt();
            }
        }
        while (SS <= 0);
        if (SS >= 60){
            MM = SS/60;
            SS = SS%60;
        }
        if (MM >= 60){
            HH = MM/60;
            MM = MM%60;
        }
        System.out.println(HH + ":" + MM + ":" + SS);
    }
}
