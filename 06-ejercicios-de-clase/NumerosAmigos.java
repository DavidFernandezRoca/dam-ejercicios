// Función que indica si dos números son amigos (la suma de los divisores de cada uno es igual al otro).

public class NumerosAmigos{
    public static void main (String args[]){
        System.out.println(esAmigo(220, 284));
    }
    public static boolean esAmigo (int a, int b){
        int acont = 1;
        int bcont = 1;
        int asumados = 0;
        int bsumados = 0;
        while (acont != a){
            if(a % acont == 0)
                asumados = asumados + acont;
            acont++;
        }
        while (bcont != b){
            if(b % bcont == 0)
                bsumados = bsumados + bcont;
            bcont++;
        }
        if(asumados == b && bsumados == a){
            return true;
        }
        else
            return false;
    }
}
