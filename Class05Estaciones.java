public class Class05Estaciones {
    public static void main (String[] args){

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.println("Introduzca un número de 1 a 4 : ");

        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        
        String estacion;

        if(numero == 1) {
            estacion = "Primavera";
        }else if(numero == 2) {
            estacion = "Verano";
        }else if(numero == 3){
            estacion = "Invierno";
        }else if(numero == 4){
            estacion = "Otoño";
        }else{
            estacion = "Un valor incorrecto";
        }

        System.out.println("La estación es : " + estacion);
    }
}
