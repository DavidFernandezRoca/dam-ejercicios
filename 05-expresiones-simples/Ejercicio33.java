// 33. Calcular el precio final de una compra utilizando precio, cantidad y descuento, sabiendo que el descuento está expresado como porcentaje.

public class Ejercicio33{
    public static void main(String args[]){
        double precio = 1;
        double cantidad = 1;
        double descuento = 1;
        System.out.println("Precio final: " + ((precio * cantidad) - (precio * cantidad) * descuento / 100));
    }
}
