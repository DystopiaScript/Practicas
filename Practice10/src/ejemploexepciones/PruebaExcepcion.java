package ejemploexepciones;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
class PruebaExcepcion {
public static void main( String[] args ) {
// Para leer un archivo
FileInputStream entrada = null;
//creamos un objeto de la clase Lanzadora
Lanzadora lanza = new Lanzadora();
int leo;
try {
entrada = new FileInputStream("archivo.txt");
while ( ( leo = entrada.read() ) != -1 )
//utilizamos el métodos de la clase Lanzadora
lanza.lanzaSiNegativo( leo );
System.out.println("Todo fue bien");
} catch ( Miexcepcion e ){ // Personalizada
System.out.println("Excepcion presentada: " + e.getMessage() );
} catch ( IOException e ){ // Estándar
System.out.println("Excepcion presentada: " + e.getMessage() );
}
}
}
