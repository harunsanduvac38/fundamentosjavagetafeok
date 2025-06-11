import java.util.Scanner;

public class Class25MetodoPositivoNegativo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        
        String result = comprobarNumero(numero);
        System.out.println(result);

    }

    public static String comprobarNumero(int numero){

        String respuesta;
        if(numero > 0){
            respuesta = "Número es POSITIVO";
        }else if(numero < 0){
            respuesta = "Número es NEGATIVO";
        }else {
            respuesta = "Número es CERO";
        }
        return respuesta;
    }
    
}
