// Función que recibe tres números y los muestra ordenados de mayor a menor.

public class MayorDeTres{
    public static void main(String args[]){
        mayorDeTres(5, 6, 7);
    }
    public static void mayorDeTres(int a, int b, int c){
        int aux;
        if (b > a){
            aux = a;
            a = b;
            b = aux;
        }
        if (c > a){
            aux = a;
            a = c;
            c = aux;
        }
        if (c > b){
            aux = b;
            b = c;
            c = aux;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
