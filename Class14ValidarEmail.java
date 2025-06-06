public class Class14ValidarEmail {
    public static void main(String[] args){

        
        java.util.Scanner teclado = new java.util.Scanner (System.in);
        System.out.println("Introduzca tu email: ");
        String email = teclado.nextLine();
        boolean check = true;

        if(email.contains("@") == false){
            check = false;
            System.out.println(" ❌ Email no tiene '@' ");
        }else {
            System.out.println(" ✅ Email tiene '@'");
            if(email.startsWith("@") == true || email.endsWith("@") == true){
                check = false;
                System.out.println(" ❌ Email empieza o termina con '@' ");
            }else {
                System.out.println(" ✅ Email no empieza o no termina con '@'");
                if(email.indexOf("@") != email.lastIndexOf("@")){
                    check = false;
                    System.out.println(" ❌ Email tiene dos o más '@'");
                }else{
                    System.out.println(" ✅ Email tiene una '@'");
                    if(email.contains(".") == false){
                        check = false;
                        System.out.println(" ❌ Email no tiene '.'");
                    }else {
                        System.out.println(" ✅ Email tiene '.'");
                        if(email.indexOf("@") > email.indexOf(".")){
                            check = false;
                            System.out.println(" ❌ '.' no está después de la '@'");
                        }else {
                            System.out.println(" ✅ '.' está después de '@'");
                            if(!(email.indexOf(".") == (email.length()) - 3 || email.indexOf(".") == (email.length()) - 4 )){
                                check = false;
                                System.out.println(" ❌ Email no tiene el dominio de dos a tres caracteres.");
                            }else {
                                System.out.println(" ✅ Email tiene dominio de dos a tres caracteres.");
                            }
                        }
                    }
                }
            }
        }

        if(check){
            System.out.println("\n " + " ✅ Email es correcto!");
        }else {
            System.out.println("\n" + " ❌ Email es incorrecto, revisa los errores!");
        }
        
    }
    
}
