import java.util.Scanner;

public class Class03SumarNumeros {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        // System.out.println("Ingresa primer numero : ");
        // int num1 = teclado.nextInt();

        // System.out.println("Ingresa segundo numero :");
        // int num2 = teclado.nextInt();
        // int num3 = num1 + num2;

        // System.out.println(num1 + " + " + num2 + " = " + num3 );




        // De otra manera
        System.out.println("Ingresa primer numero :");
        String dato = teclado.nextLine();
        int numero1 = Integer.parseInt(dato);

        System.out.println("Ingresa segundo numero :");
        dato = teclado.nextLine();
        int numero2 = Integer.parseInt(dato);

        int numero3 = numero1 + numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + numero3);



    }
    
}
