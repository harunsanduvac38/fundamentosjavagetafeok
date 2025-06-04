import java.util.Scanner;

public class Class02EjemploScanner {
    public static void main (String[] args) {

        Scanner teclado = new Scanner (System.in);
        System.out.println("Cual es tu nombre :");
        String nombre = teclado.nextLine();

        
        System.out.println("Cuantos años tienes :");
        int edad = teclado.nextInt();

        System.out.println("Bienvenido a Java " + nombre + " y tienes " + edad + " años");
    }
    
}
