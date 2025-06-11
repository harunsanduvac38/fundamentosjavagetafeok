import java.util.Scanner;

public class Class26MetodoEmail {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un email:");
        String dato = teclado.nextLine();

        Boolean validacion = validarEmail(dato);

        System.out.println("El email : " + validacion);

    }


    public static Boolean validarEmail (String email){

        Boolean check = true;

        if(email.contains("@") == false){
            check = false;
            
        }else {
            
            if(email.startsWith("@") == true || email.endsWith("@") == true){
                check = false;
                
            }else {
                
                if(email.indexOf("@") != email.lastIndexOf("@")){
                    check = false;
                    
                }else{
                    
                    if(email.contains(".") == false){
                        check = false;
                        
                    }else {
                        
                        if(email.indexOf("@") > email.indexOf(".")){
                            check = false;
                            
                        }else {
                            
                            if(!(email.indexOf(".") == (email.length()) - 3 || email.indexOf(".") == (email.length()) - 4 )){
                                check = false;
                                
                            }else {
                                
                            }
                        }
                    }
                }
            }
        }

        if(check){
            return true;
        }else{
            return false;
        }

    }
    
}
