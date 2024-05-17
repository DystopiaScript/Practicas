package ejemploexepciones;

import java.io.FileInputStream;

class PruebaException{
    public static void main(String[] args) {
        //Para leer el archivo
        FileInputStream entrada= null;
        //Creamos un objeto de la clase Lanzadora
        Lanzadora lanza = new Lanzadora();
        int leo;
        try{
            entrada = new FileInputStream("archivo.txt");
            while((leo = entrada.read()) != -1){
                //Utilizamos el métodos de la clase Lanzadora
                lanza.lanzaSiNegativo(leo);
               }   System.out.println("Todo fue bien");
            } catch (Miexcepcion e){
                //Personalizada
                System.out.println("Excepción presentada: " + e.getMessage());

            }catch (Exception e){
                //General
                System.out.println("Excepción presentada: " + e.getMessage());
        }
    }
}
