import java.util.ArrayList;
import java.util.Scanner;

public class Class22ArrayListNombres {
    public static void main (String[] args){

        // Pedir nombre hasta que escriba STOP . Mostrar los coleccionNombres listado , el total de coleccionNombres .

        Scanner teclado = new Scanner (System.in);
        String nombre = "";

        ArrayList<String> coleccionNombres = new ArrayList<String>();

        while(!(nombre.equalsIgnoreCase("stop"))){

            System.out.println("Escriba un nombre : ");
            nombre = teclado.nextLine();
            
            coleccionNombres.add(nombre);
            
        }

        coleccionNombres.remove(coleccionNombres.size() -1);

        int i = 1;
        System.out.println("\n" + "Los coleccionNombres : ");
        for(String nombresRef : coleccionNombres){
            
            System.out.println(" - Nombre " + i + " : " + nombresRef);
            i++;
        }
        
        System.out.println("\n" + "La cantidad de los coleccionNombres : " + coleccionNombres.size());
        System.out.println("\n" + "------ FIN DE PROGRAMA -----");
    }
    
}
