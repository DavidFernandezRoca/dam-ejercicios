// 42. Generar, utilizando producto, cantidad y precio, una cadena con este formato: "Teclado - 2 unidades - Total: 39.8 euros"

public class Ejercicio42{
    public static void main(String args[]){
        String producto = "Teclado";
        double precio = 19.9;
        int cantidad = 2;
        System.out.println(producto + " - " + cantidad + " unidades - Total: " + (precio * cantidad) + " euros");
    }
}
