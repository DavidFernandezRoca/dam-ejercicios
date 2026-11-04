// 40. Comprobar si una división a / b puede realizarse sin dividir entre cero y, únicamente en ese caso, comprobar si el resultado es mayor que 10.

public class Ejercicio40{
    public static void main(String args[]){
        int a = 10;
        int b = 10;
        if (b == 0){
            System.out.println("ERROR");
        }
        else{
            if (a / b > 10){
                System.out.println("El resultado es mayor que 10");
            }
            else{
                System.out.println("El resultado no es mayor que 10");
            }
        }
    }
}
