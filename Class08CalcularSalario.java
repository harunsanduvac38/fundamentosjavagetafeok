import java.util.Scanner;

public class Class08CalcularSalario {
    public static void main (String[] args) {
        System.out.println("------Bienvenido a Programa de Calcular Salario ------");

        Scanner teclado = new Scanner(System.in);

        int horaExtra = 0;
        int hora = 0;
        int importe = 0;
        int km = 0;


        System.out.println("   Introduzca las Horas Semanales :");
        String dato = teclado.nextLine();
        hora = Integer.parseInt(dato);

        System.out.println("   Introduzca Importe Hora :");
        dato = teclado.nextLine();
        importe = Integer.parseInt(dato);

        System.out.println("   Introduzca Kilometros :");
        dato = teclado.nextLine();
        km = Integer.parseInt(dato);

        int salarioBase = 0;
        int salarioExtra = 0;
        int salarioBruto = 0;
        float iva = 0;
        double salarioTotal = 0;
        String destino = "";
        String retencion = "";


        if(hora <= 36){
            salarioBase = hora * importe;
            horaExtra = 0;
        }else {
            salarioBase = 36 * importe;
            horaExtra = hora - 36;
            salarioExtra = horaExtra * (importe + 2);
        }

        salarioBruto = salarioBase + salarioExtra;
        iva = (float)(salarioBruto * 0.16);
        salarioTotal = salarioBruto - iva;


        if(km >= 101 && km <= 900){
            destino = "NACIONAL";
        }else if(km > 900){
            destino = "INTERNACIONAL";
        }else{
            destino = "PROVINCIAL";
        }

        if(salarioTotal <= 250){
            retencion = "0%";
        }else if(salarioTotal > 500){
            retencion = "50%";
        }else {
            retencion = "20%";
        }


        System.out.println("      Horas trabajadas:     " + hora);
        System.out.println("      Horas extras:         " + horaExtra);
        System.out.println("      Importe de la hora:   " + importe);
        System.out.println("      Distancia en km:      " + km);
        System.out.println("      Destino:              " + destino);
        System.out.println("      Retencion:            " + retencion);
        System.out.println("      Salario Base:         " + salarioBase);
        System.out.println("      Salario Horas Extra:  " + salarioExtra);
        System.out.println("      Salario Bruto:        " + salarioBruto);
        System.out.println("      IVA(%16):             " + Math.round(iva));
        System.out.println("      -------------------------------" + "\n" + "      Salario Total:        " + Math.round(salarioTotal));
        System.out.println("      -------------------------------" + "\n" + "      FIN DE PROGRAMA" + "\n");

    }
}
