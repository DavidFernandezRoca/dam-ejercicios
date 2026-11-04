// 39. Comprobar si una persona puede acceder, sabiendo que debe ser mayor de edad y que autorizado debe ser VERDADERO.

public class Ejercicio39{
    public static void main(String args[]){
        int edad = 18;
        boolean autorizado = false;
        if (edad >= 18 && autorizado == true){
            System.out.println("Has accedido correctamente");
        }
        else{
            System.out.println("No puedes acceder");
        }
    }
}
