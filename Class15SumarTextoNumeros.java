public class Class15SumarTextoNumeros {
    public static void main(String[] args){

        java.util.Scanner teclado = new java.util.Scanner (System.in);

        System.out.println("Introduzca un número: ");
        String numero = teclado.nextLine();
        int total = 0;

        for(int i = 0; i <= numero.length() - 1;i++){
            // int digito = (int)numero.charAt(i);
            int digito = Integer.parseInt(String.valueOf(numero.charAt(i)));
            total += digito;
            
        }
        
        System.out.println("Total de los digitos: " + total);
    }

    
}
