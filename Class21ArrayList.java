import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;

public class Class21ArrayList {
    public static void main (String[] args){


        ArrayList<Integer> coleccionNumeros = new ArrayList<Integer>();

        ArrayList cualquierCosa = new ArrayList();
        cualquierCosa.add("Texto");
        cualquierCosa.add(true);
        cualquierCosa.add(33);
        System.out.println(cualquierCosa);

        ArrayList<String> coleccion = new ArrayList<String>();
        coleccion.add("Elemento 1");
        coleccion.add("ELemento 2");
        coleccion.add("Elemento 3");
        coleccion.add("Elemento 1");

        System.out.println("Número de elementos : " + coleccion.size());

        // Vamos a modificar un elemento

        coleccion.set(1,"Nuevo elemento 2");

        // Podemos insertar elementos

        coleccion.add(1, "Elemento insertado");

        // Podemos eliminar elementos (Si enviamos el objeto va a eliminar el primero)
        // coleccion.remove("Elemento 1");

        // Eiminar por indexf permite mayor precision

        // coleccion.remove(4);

        // BUscamos dentro de la coleccion

        System.out.println("Posicion Elemento 1 : " + coleccion.indexOf("Elemento 1"));
        System.out.println("Última posicion Elemento 1 :" + coleccion.lastIndexOf("Elemento 1"));

        System.out.println("Número de elementos : " + coleccion.size());

        // Vamos a  realizar un bucle para visualizar los elementos

        // for(int i = 0; i < coleccion.size(); i++){

        //     String elemento = coleccion.get(i);
            
        // }

        // Sintaxis de bucles por referencia

        for(String elemento : coleccion){
            System.out.println(elemento);
            
        }

        // // ELiminar todos los elementos

        // coleccion.clear();

        // System.out.println("Número de elementos : " + coleccion.size());

    }
    
}
