import java.util.Scanner;

public class Class06MayorTresNumeros {
    public static void main (String[] args){

        int mayor = 0;
        int intermedio = 0;
        int menor = 0;

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
            if(numero2 > numero3){
                menor = numero3;
                intermedio = numero2;
            }
        }else if(numero2 > numero1 && numero2 > numero3){
            mayor = numero2;
            if(numero1 > numero3){
                menor = numero3;
                intermedio = numero1;
            }
        }else {
            mayor = numero3;
            if(numero1 > numero2){
                menor = numero2;
                intermedio = numero1;
            }
        }

        System.out.println(" El mayor es : " + mayor + "\n" + " El menor es : " + menor + "\n" + " El intermedio es : " + intermedio);
    }
    
}
