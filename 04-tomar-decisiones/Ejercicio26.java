// 26. Escribe un programa que pida el precio de una compra. Si el importe es superior a 100 euros, deberá aplicar un descuento del 10 %. Finalmente mostrará el importe que debe pagar el cliente.

import java.util.Scanner;

public class Ejercicio26{
    public static void main (String args[]){
        double precio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el precio de la compra: ");
        precio = sc.nextDouble();
        if (precio > 100)
            precio = precio - precio * 0.1;
        System.out.println("El precio total de la compra es: " + precio);
    }
}
