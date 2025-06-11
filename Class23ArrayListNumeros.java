import java.util.Scanner;
import java.util.ArrayList;

public class Class23ArrayListNumeros {
    public static void main (String[] args){


        // Pedir numeros hasta que tecle -1 . 

        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        ArrayList<Integer> coleccionNumeros = new ArrayList<Integer>();
    
        
        while(numero != -1){

            System.out.println("Introduzca un número :");
            numero = Integer.parseInt(teclado.nextLine());

            if(coleccionNumeros.contains(numero)){
                System.out.println("Has repetido!");
            }else {
            coleccionNumeros.add(numero);
            }
            
        }
        coleccionNumeros.remove(coleccionNumeros.size() - 1);


        System.out.println("\n" + "----- Los números -----");

        for(int numeroRef : coleccionNumeros) {
            suma +=numeroRef;
            System.out.println("   ¨¨¨¨¨   " + numeroRef + "   ¨¨¨¨¨");
            
        }
        System.out.println("\n" + "Números introducidos : " + coleccionNumeros.size());
        System.out.println("La suma de los números : " + suma + "\n");

    
    }

    
}
