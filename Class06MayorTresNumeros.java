import java.util.Scanner;

public class Class06MayorTresNumeros {
    public static void main (String[] args){

        int mayor = 0;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduzca primer número :");
        String dato = teclado.nextLine();
        int numero1 = Integer.parseInt(dato);

        System.out.println("Introduzca segundo número : ");
        dato = teclado.nextLine();
        int numero2 = Integer.parseInt(dato);

        System.out.println("Introduzca tercer número :");
        dato = teclado.nextLine();
        int numero3 = Integer.parseInt(dato);

        if(numero1 > numero2 && numero1 > numero3){
            mayor = numero1;
        }else if(numero2 > numero1 && numero2 > numero3){
            mayor = numero2;
        }else {
            mayor = numero3;
        }

        System.out.println("El mayor es : " + mayor);
    }
    
}
