import java.util.Scanner;
public class Cadenas {
public static void main (String[] args) {
    Scanner CadenaN = new Scanner(System.in);

    System.out.println("Escribe tu cadena, la que sea, lol");
    String ans = CadenaN.nextLine();

    System.out.println("""
            Elige una opción de cadena:
            1. Mostrar longitud
            2. Mostrar caracteres
            3. Mostrar cadena invertida
            4. Contar apariciones de un caracter
            5. Buscar una subcadena
            6. Checar anagrama

            """);
            int Cadena = CadenaN.nextInt();
             if (Cadena == 1) {
                System.out.println("Tu cadena mide: " + ans.length() + " digitos");
             }

             if (Cadena == 2) {
               for (int i = 0; i < ans.length(); i++) {
                  System.out.println(ans.charAt(i));
               }
             }
             if (Cadena == 3) {
               for (int i = ans.length() -1; i >= 0; i--) {
                  System.out.println(ans.charAt(i));
               }
             }
             if (Cadena == 4) {
               System.out.println("¿Cuantas apariciones hay en el caracter?");
               char caracter = CadenaN.next().charAt(0);
               int cuenta = 0;
               for (int j = 0; j < ans.length(); j++) {
                  if (ans.charAt (j) == caracter) {
                     cuenta++;
                  }
               }
               System.out.println("El caracter " + caracter + " aparece " + cuenta + " veces ");
            }
            if (Cadena == 5) {
               System.out.println("Escribe la subcadena que quieras buscar:");
               CadenaN.nextLine();
               String subString = CadenaN.nextLine();
               if (ans.contains (subString)) {
                  System.out.println("La subcadena que buscaste: " + subString + ", si esta");
               } else {
                  System.out.println("La subcadena que buscaste" + subString + " no se encuentra");
               }
            }
            if (Cadena == 6) {
               System.out.println("¿Que anagrama quieres checar?");
               CadenaN.nextLine();
               String anaString = CadenaN.nextLine();
               boolean ana = true;
               if (ans.length() != anaString.length()) {
                  ana = false;
               } else {
                  for (int k = 0; k > ans.length(); k++) {
                     char caracter = ans.charAt(k);

                     int cuentaUno = 0;
                     int cuentaDos = 0;
                     for (int a = 0; a < ans.length(); a++) {
                        if (ans.charAt(1) == caracter) {
                           cuentaUno++;
                        }
                     }
                     for (int a = 0; a < anaString.length(); a++) {
                        if (anaString.charAt(a) == caracter) {

                        }
                     }
                     if (cuentaUno != cuentaDos) {
                        ana = false;
                     }
                  }
               }
               if (ana) {
                  System.out.println("Son anagramas");
               } else {
                  System.out.println("No son anagramas");
               }

            }
   }
}