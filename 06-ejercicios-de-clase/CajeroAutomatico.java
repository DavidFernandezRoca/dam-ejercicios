// Construye un programa que comience con un saldo inicial de 1000 euros
// y muestre repetidamente este menú:
//
//   1. Consultar saldo
//   2. Ingresar dinero
//   3. Retirar dinero
//   0. Salir
//
// Utiliza switch para procesar la opción y do-while para mantener el menú activo.
// No debe permitirse retirar una cantidad superior al saldo disponible
// ni introducir cantidades negativas.
// Cuando el usuario seleccione 0, el programa mostrará el saldo final y terminará.

import java.util.Scanner;

public class CajeroAutomatico{
    public static void main (String args[]){
        double saldo = 1000;
        int opcion;
        double ingreso;
        double retirada;
        Scanner sc = new Scanner (System.in);

        do{
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Su saldo actual es: " + saldo + " €");
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.println("Saldo actual: " + saldo + " €");
                    break;
                case 2:
                    System.out.println("Ingrese su dinero: ");
                    ingreso = sc.nextDouble();
                    if (ingreso < 0){
                        System.out.println("Error, no puede introducir numeros negativos.");
                    }
                    else{
                        saldo = ingreso + saldo;
                        System.out.println("Ingreso añadido al saldo correctamente.");
                    }
                    break;
                case 3:
                    System.out.println("Indique el dinero que desea retirar: ");
                    retirada = sc.nextDouble();
                    if (retirada >= 0.01){
                        if (saldo < retirada){
                            System.out.println("Error, no puede retirar mas dinero de lo que tiene.");
                        }
                        else{
                            saldo = saldo - retirada;
                            System.out.println("Retirada realizada correctamente.");
                        }
                    }
                    else {
                        System.out.println("Error, no puedes retirar menos de 0.01");
                    }
                    break;
            }
        }
        while (opcion != 0);
    }
}
