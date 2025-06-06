import java.util.Scanner;

public class Class16NumeroNarcicista {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        String numString = teclado.nextLine();

        int numInt = Integer.parseInt(numString);


        int suma = 0;

        for(int i = 0; i < numString.length(); i++){
            suma += Math.pow(Double.parseDouble(String.valueOf(numString.charAt(i))), numString.length());
        }

        System.out.println(suma);

        if(suma == numInt){
            System.out.println("Número " + numInt + " es un Narcisista.");
        }else {
            System.out.println("Número " + numInt + " no es un Narcisista.");
        }



    }
    
}
