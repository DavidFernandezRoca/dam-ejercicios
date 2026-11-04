// Leer una nota numérica con el nombre de su alumno hasta que la nota es -1. Nos tiene que decir el alumno que más nota ha sacado de los que han sacado <7 por ejemplo, metemos Javi 5 pedro 8 luis 6 joaquin 10 el alumno con mas nota por debajo de 7 es luis

import java.util.Scanner;

public class MejorNotaMenorDeSiete {
    public static void main(String[] args) {
        String alumno = "";
        int nota;
        String alumnomaxnota = "";
        int maxnota = -1;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce la nota (Acaba con -1)");
        nota = leer.nextInt();
        System.out.println("Introduce el nombre del alumno:");
        alumno = leer.next();
        while (nota != -1){
            if (nota >= maxnota && nota < 7){
                maxnota = nota;
                alumnomaxnota = alumno;
            }
            System.out.println("Introduce la nota (Acaba con -1)");
            nota = leer.nextInt();
            System.out.println("Introduce el nombre del alumno:");
            alumno = leer.next();
        }
        if (maxnota != -1) {
            System.out.println("El alumno con más nota por debajo de 7 es: " + alumnomaxnota + " con una nota de " + maxnota);
        }
        else {
            System.out.println("No se introdujeron notas por debajo de 7.");
        }
    }
}
