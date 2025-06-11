public class Class24Metodos {

    public static void main(String[] args) { //Esto es un metodo

        System.out.println("Ejemplo métodos.");

        metodoAccion();
        // En los metodos return, demebos almacenar la respuesta en alguna variable

        String saludo = metodoSaludo();
        System.out.println(saludo);

        int sumaResult = sumarNumeros(1,2);
        System.out.println("La suma es : " + sumaResult);


        System.out.println("Fin de Programa.");
        
    }

    
    // Los metodos siempre van a nivel de Clase, en cualquier sitio por dentro de Clase


    public static void metodoAccion(){    //Un metodo de accion ejecuta codigo

        System.out.println("Soy un método de acciones.");


    }


    public static String metodoSaludo(){    //Metodo return

        return  "Mi primer método return, que ilusión";
    }

    // Los metodos pueden recibir parametros: metodo para sumar dos numeros y que devuelva la suma : 
    public static int sumarNumeros(int num1, int num2){

        int suma = num1 + num2;
        return suma;
    }
    

    
}
