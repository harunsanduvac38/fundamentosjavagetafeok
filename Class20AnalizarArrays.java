import java.util.Scanner;

public class Class20AnalizarArrays {
    public static void main(String[] args){


        int mayor = 0;
        int menor = 0;
        double media = 0;
        int suma = 0;
        int[] numeros = new int[8];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 8; i++){
            System.out.println("Introduzca número " + (i+1));
            numeros[i] =  Integer.parseInt(String.valueOf(teclado.nextLine()));

            // if(mayor <= numeros[i]){
            //     mayor = numeros[i];
            // }
            // if(i==0){
            //     menor = numeros[i];
            // }
           
            // if(menor > numeros[i]){
            //     menor = numeros[i];
            // }
            if(i == 0){
                mayor = numeros[0];
                menor = numeros[0];
            }
            mayor = Math.max(numeros[i], mayor);
            menor = Math.min(numeros[i], menor);

            suma += numeros[i];
        }

        media = (double)suma / (double)numeros.length;

        
        System.out.println("\n" + "El mayor : " + mayor);
        System.out.println("\n" + "El menor : " + menor);
        System.out.println("\n" + "La media : " + media);
        System.out.println("\n" + "La suma : " + suma);

    }
    
}
