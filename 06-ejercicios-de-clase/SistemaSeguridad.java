// Sistema de seguridad: pide un código de acceso de 4 cifras con 3 intentos. El código es válido si sus cifras suman 22 y el factorial de su última cifra es 362880.

import java.util.Scanner;

public class SistemaSeguridad {

    public static void main(String args[]) {
        int intentos = 3;
        int CODIGO_CORRECTO = 4729;
        int codigo = 0;
        boolean acceso = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("          SECURITY SYSTEM   v3.0");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("INICIANDO SISTEMA...");
        System.out.println();
        System.out.println("CAMARA 07 DETECTADA");
        System.out.println("ACCESO RESTRINGIDO");
        System.out.println();
        System.out.println("INTRODUCE CODIGO DE ACCESO");
        while (intentos > 0 && acceso == false) {
            textoInicio(intentos);
            codigo = sc.nextInt();

            if (esCodigoValido(codigo) == true && sumarCifras(codigo) == 22 && factorial(codigo) == 362880) {
                acceso = true;
                System.out.println("VERIFICANDO CODIGO...");
                System.out.println("SUMA DE CIFRAS: " + sumarCifras(codigo));
                System.out.println("FACTORIAL: " + factorial(codigo));
                System.out.println();
                System.out.println("ACCESO CONCEDIDO");
                System.out.println("CAMARA DESBLOQUEADA");
                System.out.println("===========================================");
            } else {
                intentos--;
                System.out.println();
                System.out.println("ACCESO DENEGADO");
                System.out.println();
            }
        }

        if (acceso == false)
            System.out.println("SISTEMA BLOQUEADO");
    }
    public static boolean esCodigoValido(int codigo){
        int cifras = 0;
        boolean valido = false;
        while (codigo > 0){
            codigo = codigo / 10;
            cifras++;
        }
        if (cifras == 4)
            valido = true;
        return valido;
    }
    public static int sumarCifras(int codigo){
        if(codigo > 0)
            return codigo = codigo % 10 + sumarCifras(codigo / 10);
        else
            return codigo;
    }
    public static long factorial (int codigo){
        int ultimacifra;
        long acumfactorial = 1;
        ultimacifra = codigo % 10;
        while (ultimacifra > 0){
            acumfactorial = ultimacifra * acumfactorial;
            ultimacifra--;
        }
        return acumfactorial;
    }
    public static void textoInicio(int intentos) {
        System.out.println("INTENTOS RESTANTES: " + intentos);
        System.out.println();
        System.out.print("CODIGO: ");
    }
}
