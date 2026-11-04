// Función que indica si un número es perfecto (igual a la suma de sus divisores).

public class NumeroPerfecto{
    public static void main (String args[]){
        System.out.println(esPerfecto(6));
    }
    public static boolean esPerfecto (int numero){
        int contador = 1;
        int sumados = 0;
        while (contador != numero){
            if(numero % contador == 0)
                sumados = sumados + contador;
            contador++;
        }
        if(sumados == numero)
            return true;
        else
            return false;
    }
}
