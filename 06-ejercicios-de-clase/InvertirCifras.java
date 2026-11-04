// Función que invierte el orden de las cifras de un número.

public class InvertirCifras{
    public static void main(String args[]){
        System.out.println(invertir(4321));
    }
    public static int invertir(int a){
        int invertido = 0;
        while (a > 0){
            invertido = invertido * 10 + a % 10;
            a = a / 10;
        }
        return invertido;
    }
}
