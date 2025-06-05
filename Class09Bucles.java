public class Class09Bucles {
    public static void main(String[] args){
        // // Bucles contador (for) _ Debemos indicar un inicio, un final(while) y in incremento

        // for (int i = 1; i <= 5; i++){
        //     System.out.println("For mas uno: " + i);
        // }

        // for (int i = 1; i <= 7; i+=3){
        //     System.out.println("For mas tres: " + i);
        // }

        // for (int i = 7; i > 0; i--){
        //     System.out.println("For restando uno: " + i);
        // }

        // // Bucles de condicion _ Necesitan una condición para salir

        // int contador = 1;
        // while(contador <= 5){
            
        //     System.out.println("While: " + contador);
        //     contador++;
           
        // }
    
        // Mostrar los 20 primeros números pares 

        // for(int i = 0; i <=20; i++){
        //     if(i % 2 == 0){
        //         System.out.println("Numero par: " + i);
        //     }
        // }
        


        // Vamos a pedir al usuario textos hasta que escriba stop

        java.util.Scanner teclado = new java.util.Scanner (System.in);
        String dato = "";
        while(dato.equals("stop") == false){
            System.out.println("Dime algo bonito. (stop para salir)");
            dato = teclado.nextLine();
        }



    }
    
}
