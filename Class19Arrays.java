public class Class19Arrays {
    public static void main(String[] args){

        // Vamos a declarar un array 
        String[] nombres = new String[3];
        // Podemos acceder a sus posiciones mediante el indice
        // Podemos visualizar la longitud
        System.out.println("Longitud del Array : " + nombres.length);

        // nombres[0] = "Lucia"; igual a null
        nombres[1] = "Adrian";
        nombres[2] = "Diana";

        for(int i = 0; i < nombres.length; i++){
            System.out.println("Nombres : " + i + " = " + nombres[i]);
        }

        System.out.println("\n\n");

        int[] numeros = new int[] {11,21,31,41,51,61,71,81};
        System.out.println("Elementos en Array de int: " + numeros.length);
        System.out.println("ELemnto  del array en posicion 2 : " + numeros[2]);

    }
    
}
