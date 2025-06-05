
import java.util.Scanner;
public class Class07DiaNacimiento {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingresa el día del nacimiento :");
        String dato = teclado.nextLine();
        int dia = Integer.parseInt(dato);


        System.out.println("Ingresa el mes del nacimiento :");
        dato = teclado.nextLine();
        int mes = Integer.parseInt(dato);


        System.out.println("Ingresa el año del nacimiento :");
        dato = teclado.nextLine();
        int anyo = Integer.parseInt(dato);

        // Operación 1 Multiplicar el Mes más 1 por 3 y dividirlo entre 5
        if(mes == 1){
            mes = 13;
            anyo -= 1;
        }
        if(mes == 2){
            mes = 14;
            anyo--;
        }

        int op1 = ((mes + 1) * 3) / 5;

        // operación 2 Dividir el año entre 4

        int op2 = (anyo / 4);

        // operación 3  Dividir el año entre 100

        int op3 = anyo / 100;

        // operacion 4  Dividir el año entre 400
        int op4 = anyo / 400;

        // operacion 5   Sumar el dia, el doble del mes, el año, el resultado de la operación 1,
        //  el resultado de la operación 2, menos el resultado de la operación 3 más la operación 4 más 2.
        int op5 = dia + (mes * 2) + anyo + op1 + op2 - op3 + op4 + 2;

        // operacion 6  Dividir el resultado anterior entre 7.
        int op6 = op5 / 7;

        // operecion 7 Restar el número del paso 5 con el número del paso 6 por 7.

        int op7 = op5 - (op6 * 7);

        System.out.println(op7);

        // Final Miramos la tabla y vemos que el número 1 corresponde a Domingo

        String diaSemana = "";
        if(op7 == 0){
            diaSemana = "Sábado";
        }else if(op7 == 1){
            diaSemana = "Domingo";
        }else if(op7 == 2){
            diaSemana = "Lunes";
        }else if(op7 == 3){
            diaSemana = "Martes";
        }else if(op7 == 4){
            diaSemana = "Miércoles";
        }else if(op7 == 5){
            diaSemana = "Jueves";
        }else if (op7 == 6){
            diaSemana = "Viernes";
        }else {
            diaSemana = "Hemos pinchado ..";
        }

        System.out.println("El día de la semana es : " + diaSemana);

        System.out.println("Fin de Programa");
    }
    
}
