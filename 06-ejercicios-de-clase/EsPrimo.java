// Función que indica si un número es primo.

public class EsPrimo{
    static public void main (String args[]){
        System.out.println(esPrimo(7));
    }
    static public boolean esPrimo(int a){
        int contador = a - 1;

        while (contador >= 2){
            if (a % contador == 0)
                return false;
            contador--;
        }
        return a != 1; // no consideramos que 1 sea primo.
    }
}
