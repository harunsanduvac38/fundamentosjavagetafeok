import java.util.Scanner;

public class Class25MetodoPositivoNegativo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        String dato = teclado.nextLine();
        
        String result = comprobarNumero(dato);
        System.out.println(result);

    }

    public static String comprobarNumero(String dato){

        if(Integer.parseInt(dato) > 0){
            return "Número es POSITIVO";
        }else if(Integer.parseInt(dato) < 0){
            return "Número es NEGATIVO";
        }else {
            return"Número es CERO";
        }
    }
    
}
