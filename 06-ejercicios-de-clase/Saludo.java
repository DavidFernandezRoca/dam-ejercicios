// programa que imprima la funcion saluda y este programa debera imprimir esta funcion 100 veces

public class Saludo{
    public static void main(String args[]){
        int x;
        for (x= 0; x < 100; x++)
            saluda();
    }
    public static void saluda (){
        System.out.println("Yo te saludo");
    }
}
