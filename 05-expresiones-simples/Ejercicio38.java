// 38. Comprobar si numero es divisible simultáneamente entre 2 y entre 3.

public class Ejercicio38{
    public static void main(String args[]){
        int numero = 1;
        if (numero % 2 == 0 && numero % 3 == 0){
            System.out.println("Tu número es divisible por 2 y 3");
        }
        else{
            System.out.println("Tu número no es divisible por 2 y 3");
        }
    }
}
