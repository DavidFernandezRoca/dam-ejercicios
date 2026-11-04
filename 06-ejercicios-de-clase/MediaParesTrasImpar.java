// Este programa lee una secuencia de números terminada en cero y devuelve la media de los números pares que se introdujeron después del primer impar

import java.util.Scanner;

public class MediaParesTrasImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int sumaPares = 0;
        int contadorPares = 0;
        int media;
        boolean primerImparEncontrado = false;

        System.out.println("Introduce números (termina con 0):");
        numero = sc.nextInt();
        while (numero != 0) {
            if (numero % 2 != 0) {
                primerImparEncontrado = true;
            }
            if (primerImparEncontrado && numero % 2 == 0){
                sumaPares = numero + sumaPares;
                contadorPares++;
            }
            numero = sc.nextInt();
        }
        if(contadorPares == 0){
            System.out.println("No se introdujeron números pares después del primer impar.");
        }
        if (numero == 0 && contadorPares != 0) {
            media = sumaPares / contadorPares;
            System.out.println("La media de los números pares después del primer impar es: " + media);
        }
    }
}
