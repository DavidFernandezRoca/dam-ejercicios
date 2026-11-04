// Función que muestra todos los números comprendidos entre dos valores.

public class MostrarNumeros{
    public static void main (String args[]){
        mostrarNumeros(1, 100);
    }
    public static void mostrarNumeros(int desde, int hasta){
        for (int contador = desde; contador <= hasta; contador++){
            System.out.println(contador);
        }
    }
}
