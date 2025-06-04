import java.util.Scanner;

public class Class08CalcularSalario {
    public static void main (String[] args) {
        System.out.println("------Bienvenido a Programa de Calcular Salario ------");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca las Horas Semanales :");
        String dato = teclado.nextLine();
        int hora = Integer.parseInt(dato);

        System.out.println("Introduzca Importe Hora :");
        dato = teclado.nextLine();
        int importe = Integer.parseInt(dato);

        System.out.println("Introduzca Kilometros :");
        dato = teclado.nextLine();
        int km = Integer.parseInt(dato);

        int salarioBase = 0;
        int salarioExtra = 0;
        int salarioBruto = 0;

        if(hora <= 36){
            salarioBase = hora * importe;
        }else {
            salario
        }
    }
    
}
