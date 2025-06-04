import java.util.Scanner;

public class Class04PositivoNegativo {
    public static void main (String[] args){

        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un número :");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);

        
        // int numero = 10;
        // numero = 0;
        // numero = -123;

        if(numero > 0) {
            System.out.println(" El número es Positivo.");
        }else if (numero == 0){
            System.out.println("El número es Cero.");
        }else {
            System.out.println("El número es Negativo.");
        }

        System.out.println("Fin de programa!");
    }
    
}
