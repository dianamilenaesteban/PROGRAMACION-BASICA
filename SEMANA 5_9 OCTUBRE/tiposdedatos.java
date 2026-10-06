public class TiposDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    var datos= new Scanner(System.in);
    System.out.println("dame tu edad:");
     var edad= datos.nextInt();
    System.out.println("dame tu estatura");
    var estatura = datos.nextDouble(); 
    datos.nextLine();
    System.out.println("dame tu nombre");
    var nombre = datos.nextLine();
    
        System.out.println("edad: "+edad);
        System.out.println("estatura "+estatura);
        System.out.println("nombre "+nombre);
            
    
    
    
    }
    
}
