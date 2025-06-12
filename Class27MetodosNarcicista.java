import java.util.ArrayList;

public class Class27MetodosNarcicista {

    public static void main(String[] args){

        ArrayList<Integer> numNarcicista = new ArrayList<Integer>();

        for(int i=1; i<=20000; i++){

            String numString = String.valueOf(i);

            int numInt = i;

            if(narcicista(numString)){
                numNarcicista.add(numInt);
            }
        }

        System.out.println("\n <---- Los Números Narcicistas ----> \n");
        for(int num : numNarcicista){
            System.out.println(" -- >             " + num);
        }   

        System.out.println("Fin de Programa!");
    }

    public static boolean narcicista(String numString){

         int suma = 0;
         int numInt = Integer.parseInt(numString);

        for(int i = 0; i < numString.length(); i++){
            suma += Math.pow(Double.parseDouble(String.valueOf(numString.charAt(i))), numString.length());
        }

        if(suma == numInt){
            return true;
        }else {
            return false;
        }

    }
    
}
