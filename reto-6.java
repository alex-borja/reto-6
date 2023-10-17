import java.util.Scanner;

class RETO_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        final String MENSAJE = "Dime (1: SI; 2: NO) si el numero esta en la terjeta numero ";
        int respuesta;

        int tarjeta = 1;
        int primerNumero = 1;
        int numeroParaAdivinar = 0;

        System.out.println("Piensa en un numero entre el 1 y el 99. \n");

        System.out.println(MENSAJE + tarjeta);
        respuesta = myScanner.nextInt();
        if(respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        tarjeta = 2;
        primerNumero = 2;
        System.out.println(MENSAJE + tarjeta);
        respuesta = myScanner.nextInt();
        if(respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        tarjeta = 3;
        primerNumero = 4;
        System.out.println(MENSAJE + tarjeta);
        respuesta = myScanner.nextInt();
        if(respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        tarjeta = 4;
        primerNumero = 8;
        System.out.println(MENSAJE + tarjeta);
        respuesta = myScanner.nextInt();
        if(respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        tarjeta = 5;
        primerNumero = 16;
        System.out.println(MENSAJE + tarjeta);
        respuesta = myScanner.nextInt();
        if(respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        tarjeta = 6;
        primerNumero = 32;
        System.out.println(MENSAJE + tarjeta);
        respuesta = myScanner.nextInt();
        if(respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        tarjeta = 7;
        primerNumero = 64;
        System.out.println(MENSAJE + tarjeta);
        respuesta = myScanner.nextInt();
        if(respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        System.out.println(numeroParaAdivinar);
    }   
}