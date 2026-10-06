public class Nombreporconsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //la variable scanner permite interpreterar lo que el ussuario ingresa 
    var scanner = new Scanner(System.in);
     // permite mostrar informacion de la consiola     
    //System.out.println ("Dame tu nombre")
     //la variable  n guarda la informacion que el usuario ingreso y scanner.nextLine pasa esa informacion a string   
    
        System.out.println("DAME TU NOMBRE:");
        var n=scanner.nextLine();
        System.out.println("El nombre es: "+ n);
    
    
    }
    
}
