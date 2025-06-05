public class Class10TablaMultiplicar {
    public static void main (String[] args){


        String dato = "";
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduzca un número de 1 a 10: ");
        
        dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        System.out.println("\n" + "--------   La tabla multiplicación de " + numero + " --------");

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }
        System.out.println("\n" + "Fin de Programa");
    }
    
}
