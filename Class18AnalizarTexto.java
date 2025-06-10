import java.util.Scanner;

public class Class18AnalizarTexto {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Itroduzca un texto con numero: ");
        String texto = teclado.nextLine();

        int numLetra = 0;
        int numDigit = 0;
        int numVocal = 0;
        int numConso = 0;
        int numMayus = 0;

        for(int i = 0; i <texto.length(); i++){
            char caracter = texto.charAt(i);
            if(Character.isLetter(caracter)){
                numLetra++;
                if(Character.isUpperCase(caracter)){
                    numMayus++;
                }
                if(Character.toLowerCase(caracter) == 'a' || 
                Character.toLowerCase(caracter) == 'e' ||
                Character.toLowerCase(caracter) == 'i' ||
                Character.toLowerCase(caracter) == 'u') {
                    numVocal++;
                }else {
                    numConso++;
                }
            }else if(Character.isDigit(caracter)){
                numDigit++;
            }
        }
        System.out.println("\n  " + 
        "Número de letras :      " + numLetra + "\n  " +
        "Número de dígitos :     " + numDigit + "\n  " +
        "Número de vocales :     " + numVocal + "\n  " + 
        "Número de consonantes : " + numConso + "\n  " + 
        "Número de Mayúsculas :  " + numMayus );

        System.out.println("\n" + "--------Fin de Programa-------");
    }
}
