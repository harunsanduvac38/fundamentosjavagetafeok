import java.util.Scanner;

public class Class11Collatz {
    public static void main (String[] args){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Un Número: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        

        while(numero != 1){

            if(numero % 2 == 0){
                numero = numero / 2;
            }else {
                numero = (numero * 3) + 1;
            }
            System.out.println(numero);
        }
        System.out.println("LLegamos a 1, Collatz es Verdadero!");
        System.out.println("Fin de Programa");
    }
    
}
