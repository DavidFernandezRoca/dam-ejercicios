// 15. Una tienda conoce el precio de un producto y el número de unidades compradas. Escribe un programa que calcule el importe total de la compra.

import java.util.Scanner;

public class Ejercicio15{
    public static void main(String args[]){
        double precio;
        int cantidad;
        Scanner leer = new Scanner(System.in);

        System.out.println("Dime el precio: ");
        precio = leer.nextDouble();
        System.out.println("Dime la cantidad: ");
        cantidad = leer.nextInt();
        System.out.println("El importe total es: " + (precio * cantidad));
    }
}
