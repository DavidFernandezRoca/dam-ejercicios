// 16. Una tienda aplica un IVA del 21 %. Escribe un programa que pida el precio de un producto sin IVA y calcule el precio final. Utiliza una constante para almacenar el porcentaje de IVA.

import java.util.Scanner;

public class Ejercicio16{
    public static void main(String args[]){
        double precio;
        double iva = 0.21;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        precio = sc.nextDouble();
        iva = iva * precio;
        System.out.println("Precio total incluyendo el IVA: " + (iva + precio));
    }
}
