// programa que imprima la funcion saluda + nombre + edad y este programa debera imprimir esta funcion 100 veces dependiendo de la edad dice una cosa o no <18 o >18

public class SaludoNombreEdad{
    public static void main(String args[]){
        int i = 0;

        for (i= 0; i < 100; i++)
            saluda("David", 18);
    }
    public static void saluda (String nombre, int edad){
        if(edad < 18)
            System.out.println("Yo te saludo " + nombre);
        else
            System.out.println("Yo te saludo SR." + nombre);
    }
}
