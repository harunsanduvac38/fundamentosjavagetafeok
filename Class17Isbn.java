import java.util.Scanner;

public class Class17Isbn {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un ISBN de 10 caracteres: ");
        String isbnString = teclado.nextLine();


        int suma = 0;

        if(isbnString.length() == 10){
            
            for(int i = 1; i <= 10; i++){
                suma += Integer.parseInt(String.valueOf(isbnString.charAt(i-1)))* i;
            }

            if(suma%11 == 0){
            System.out.println("ISBN es correcto!");

            }else {
                System.out.println("ISBN es incorrecto!");
            }

        }else {
            System.out.println("ISBN debe ser de 10 caracteres!");
        }
        

        

        System.out.println("Fin de Programa.");
    }
    
}
