
public class ReemplazaLetra {
    
    public static void main(String[] args) {
        String s1 = "hola";
      String s2 = "ADIOS";
      String s3 = "   espacios   ";

      System.out.printf( "s1 = %s\ns2 = %s\ns3 = %s\n\n", s1, s2, s3 );

      // test method replace      
      System.out.printf("Reemplaza 'l' por 'L' en s1: %s\n\n", s1.replace( 'l', 'L' ) );
      System.out.printf("Reemplaza 'D' por 'R' en s1: %s\n\n", s2.replace( 'D', 'R' ) );
      System.out.printf("Reemplaza espacio por '*' en s1: %s\n\n", s3.replace( ' ', '*' ) );
    }
    
}

