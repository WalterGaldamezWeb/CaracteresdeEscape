package caracteresdeescape;

/**
*
 * @author Walter Galdamez
 */
public class CaracteresdeEscape {

    public static void main(String[] args) {
        
        /*Manejo de Cadenas en java y Uso de Caracteres de escape

        \n =Salto de linea.
        \t =Tabulación.
        \r =Cambio de carro.
        \b =Retroceso.
        \' =Comilla Simple.
        \" =Comilla Doble

        */

            String nombre = "Walter";
            String apellido = "Galdamez";

            System.out.println("Concatenacion: "+nombre+" "+apellido);

            System.out.println("Salto de linea:\n "+nombre+" "+apellido);

            System.out.println("Tabulacion:\t"+nombre+" "+apellido);

            System.out.println("Retroceso:\b"+nombre+" "+apellido);

            System.out.println("Cambio de carro:\r"+nombre+" "+apellido);

            System.out.println("Comilla Simple\'"+nombre+" "+apellido+"\'");

            System.out.println("Comilla doble:\""+nombre+" "+apellido+"\"");

    }
    
}
