import java.util.Scanner;
public class Patrones {
    public static void PatronTrianguloDelimitado(int n){
        int i,j;

        for (i=1; i <= n; i++) {
            for (j=1; j <= n-i; j++){
                System.out.print(" ");
            }

            if (i == 1) {

                System.out.print(" 1");

            } else {
                System.out.print("1");

                for (j = 1; j < i; j++) {
                    System.out.print(" *");
                }
                System.out.print(" 1");
            }


            System.out.println();
        }
    }
    public static void PatronPiramideAsteriscos(int n){
        int i,j,k;

        for (i=1; i <= n; i++) {
            for (j=1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(k=1;k <= i ;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void PatronPiramideAsteriscosInv(int n){
        int i,j,k;
        for (i=n; i >= 1; i--) {
            for (j=1; j <= (n-i) + 1; j++){
                System.out.print(" ");
            }
            for(k=1;k <= i ;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void PatronRomboAsteriscos(int n){
        PatronPiramideAsteriscos(5);
        PatronPiramideAsteriscosInv(4);
    }

    //Piramide numerica simetrica
    public static void PatronNumericoSimetrico(int n){
        int i,j,k;
        
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++){
                System.out.print(k + " ");
            }

            for (k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println("");
        }

    }
    public static void main(String[] args) {
        Scanner Npatron = new Scanner(System.in);
        System.out.println("""
        Elige un patron
        1.Triangulo delimitado
        2.Piramide de asteriscos
        3.Rombo de asteriscos
        4.Piramide numerica simetrica

        """);
        
        int patron = Npatron.nextInt();
        if (patron == 1) {
            PatronTrianguloDelimitado(5);
        }

        if(patron == 2) {
            PatronPiramideAsteriscos(5);

        }

        if (patron == 3) {
            PatronRomboAsteriscos(5);
        }

        if(patron == 4){
            PatronNumericoSimetrico(5);
        }
        
    }
}