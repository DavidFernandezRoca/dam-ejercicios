// programa que imprima la funcion saluda con tu nombre y este programa debera imprimir esta funcion 100 veces

public class SaludoNombre{
    public static void main(String args[]){
        int x;
        for (x= 0; x < 100; x++)
            saluda("David");
    }
    public static void saluda (String nombre){
        System.out.println("Yo te saludo " + nombre);
    }
}
