import java.util.Scanner;
/**
 * Este programa se encarga de realizar operaciones basicas
 * con enteros de 8 bits, y operando en binario.
 * @author Sebastian
 * @version 1.0
 * @since 25/09/2026
 */
public class CalculadoraBinaria{
    public static void main(String[] args) {
    //Creacion instancia de escaner para
    //lectura de la entrada del sistema
    Scanner scan = new Scanner(System.in);

    //Menu//
    System.out.println("""
        Calculadora Binaria de 8 Bits
        1.Suma
        2.Resta
        3.Multiplicacion
        4.Division

        Digita una opcion valida:
        """);

        int resp = scan.nextInt();
        //Suma
        if(resp == 1){
          boolean negativoX = false;
          boolean negativoY = false;
          System.out.println("Digita el primer numero");
          int x = scan.nextInt();
          if(x <= -1){ negativoX = true; x = x*-1;}
          System.out.println("Digita el segundo numero");
          int y = scan.nextInt();
          if(y <= -1){ negativoY = true; y = y*-1;}
          //Declaracion 8 bits para primer numero
          int x1,x2,x3,x4,x5,x6,x7,x8;
          //Declaracion 8 bits para segundo numero
          int y1,y2,y3,y4,y5,y6,y7,y8;
          int z1,z2,z3,z4,z5,z6,z7,z8;
          //Inicializacion en 0
          x1=x2=x3=x4=x5=x6=x7=x8=0;
          y1=y2=y3=y4=y5=y6=y7=y8=0;
          z1=z2=z3=z4=z5=z6=z7=z8=0;

            for(int i = 8;i >= 1;i--){
              int resX = x%2;
              x = x/2;

              int resY = y%2;
              y = y/2;

              switch (i) {
                case 1: x1 = resX; y1 = resY; break;
                case 2: x2 = resX; y2 = resY; break;
                case 3: x3 = resX; y3 = resY; break;
                case 4: x4 = resX; y4 = resY; break;
                case 5: x5 = resX; y5 = resY; break;
                case 6: x6 = resX; y6 = resY; break;
                case 7: x7 = resX; y7 = resY; break;
                case 8: x8 = resX; y8 = resY; break;
              }
            }

            // Caso x negativo
            if (negativoX) {
              if (x1 == 0) {x1 = 1;} else {x1 = 0;}
              if (x2 == 0) {x2 = 1;} else {x2 = 0;}
              if (x3 == 0) {x3 = 1;} else {x3 = 0;}
              if (x4 == 0) {x4 = 1;} else {x4 = 0;}
              if (x5 == 0) {x5 = 1;} else {x5 = 0;}
              if (x6 == 0) {x6 = 1;} else {x6 = 0;}
              if (x7 == 0) {x7 = 1;} else {x7 = 0;}
              if (x8 == 0) {x8 = 1;} else {x8 = 0;}

              int acarreo = 1;
              // Desde que i es = 8, mientras i sea mayor igual a 1
              // Y acarreo sea = 1 , ejecuta y luego resta 1 a i
              for (int i = 8; i >= 1 && acarreo == 1; i--) {
                switch (i) {
                  case 8: if (x8 == 0) { x8 = 1; acarreo = 0; } else { x8 = 0; } break;
                  case 7: if (x7 == 0) { x7 = 1; acarreo = 0; } else { x7 = 0; } break;
                  case 6: if (x6 == 0) { x6 = 1; acarreo = 0; } else { x6 = 0; } break;
                  case 5: if (x5 == 0) { x5 = 1; acarreo = 0; } else { x5 = 0; } break;
                  case 4: if (x4 == 0) { x4 = 1; acarreo = 0; } else { x4 = 0; } break;
                  case 3: if (x3 == 0) { x3 = 1; acarreo = 0; } else { x3 = 0; } break;
                  case 2: if (x2 == 0) { x2 = 1; acarreo = 0; } else { x2 = 0; } break;
                  case 1: if (x1 == 0) { x1 = 1; acarreo = 0; } else { x1 = 0; } break;
                  }
                }
              }
            // Caso y negativo
            if (negativoY) {
              if (y1 == 0) {y1 = 1;} else {y1 = 0;}
              if (y2 == 0) {y2 = 1;} else {y2 = 0;}
              if (y3 == 0) {y3 = 1;} else {y3 = 0;}
              if (y4 == 0) {y4 = 1;} else {y4 = 0;}
              if (y5 == 0) {y5 = 1;} else {y5 = 0;}
              if (y6 == 0) {y6 = 1;} else {y6 = 0;}
              if (y7 == 0) {y7 = 1;} else {y7 = 0;}
              if (y8 == 0) {y8 = 1;} else {y8 = 0;}

              int acarreo = 1;

              for (int i = 8; i >= 1 && acarreo == 1; i--) {
                switch (i) {
                  case 8: if (y8 == 0) { y8 = 1; acarreo = 0; } else { y8 = 0; } break;
                  case 7: if (y7 == 0) { y7 = 1; acarreo = 0; } else { y7 = 0; } break;
                  case 6: if (y6 == 0) { y6 = 1; acarreo = 0; } else { y6 = 0; } break;
                  case 5: if (y5 == 0) { y5 = 1; acarreo = 0; } else { y5 = 0; } break;
                  case 4: if (y4 == 0) { y4 = 1; acarreo = 0; } else { y4 = 0; } break;
                  case 3: if (y3 == 0) { y3 = 1; acarreo = 0; } else { y3 = 0; } break;
                  case 2: if (y2 == 0) { y2 = 1; acarreo = 0; } else { y2 = 0; } break;
                  case 1: if (y1 == 0) { y1 = 1; acarreo = 0; } else { y1 = 0; } break;
                  }
               }
            }

            //Suma Binaria de los
            int acarreo = 0;
            int suma;

            for (int i = 8; i >= 1; i--) {
            switch (i) {
                case 8:
                    suma = x8 + y8 + acarreo;
                    z8 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 7:
                    suma = x7 + y7 + acarreo;
                    z7 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 6:
                    suma = x6 + y6 + acarreo;
                    z6 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 5:
                    suma = x5 + y5 + acarreo;
                    z5 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 4:
                    suma = x4 + y4 + acarreo;
                    z4 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 3:
                    suma = x3 + y3 + acarreo;
                    z3 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 2:
                    suma = x2 + y2 + acarreo;
                    z2 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 1:
                    suma = x1 + y1 + acarreo;
                    z1 = suma % 2;
                    acarreo = suma / 2;
                    break;
            }
        }
        System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
        System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
        System.out.println("Resultado:");
        System.out.println("" + z1+z2+z3+z4+z5+z6+z7+z8);

          }
    //Resta 
    if (resp == 2) {
      boolean negativoX = false;
      boolean negativoY = false;
      System.out.println("Digita el primer numero");
      int x = scan.nextInt();
      if(x <= -1){ negativoX = true; x = x*-1;}
      System.out.println("Digita el segundo numero");
      int y = scan.nextInt();
      if(y <= -1){ negativoY = true; y = y*-1;}
      //Declaracion 8 bits para primer numero
      int x1,x2,x3,x4,x5,x6,x7,x8;
      //Declaracion 8 bits para segundo numero
      int y1,y2,y3,y4,y5,y6,y7,y8;
      int z1,z2,z3,z4,z5,z6,z7,z8;
      //Inicializacion en 0
      x1=x2=x3=x4=x5=x6=x7=x8=0;
      y1=y2=y3=y4=y5=y6=y7=y8=0;
      z1=z2=z3=z4=z5=z6=z7=z8=0;

      for (int i = 8; i>= 1;i--) {
        int resX = x%2;
        x = x/2;

        int resY = y%2;
        y = y/2;

        switch (i) {
          case 1: x1 = resX; y1 = resY; break;
          case 2: x2 = resX; y2 = resY; break;
          case 3: x3 = resX; y3 = resY; break;
          case 4: x4 = resX; y4 = resY; break;
          case 5: x5 = resX; y5 = resY; break;
          case 6: x6 = resX; y6 = resY; break;
          case 7: x7 = resX; y7 = resY; break;
          case 8: x8 = resX; y8 = resY; break;
        }
      }

      //Caso x negativo
      if (negativoX) {
        if (x1 == 0) {x1 = 1;} else {x1 = 0;}
        if (x2 == 0) {x2 = 1;} else {x2 = 0;}
        if (x3 == 0) {x3 = 1;} else {x3 = 0;}
        if (x4 == 0) {x4 = 1;} else {x4 = 0;}
        if (x5 == 0) {x5 = 1;} else {x5 = 0;}
        if (x6 == 0) {x6 = 1;} else {x6 = 0;}
        if (x7 == 0) {x7 = 1;} else {x7 = 0;}
        if (x8 == 0) {x8 = 1;} else {x8 = 0;}

        int acarreo = 1;
        // Desde que i es = 8, mientras i sea mayor igual a 1
        // Y acarreo sea = 1 , ejecuta y luego resta 1 a i
        for (int i = 8; i >= 1 && acarreo == 1; i--) {
          switch (i) {
            case 8: if (x8 == 0) { x8 = 1; acarreo = 0; } else { x8 = 0; } break;
            case 7: if (x7 == 0) { x7 = 1; acarreo = 0; } else { x7 = 0; } break;
            case 6: if (x6 == 0) { x6 = 1; acarreo = 0; } else { x6 = 0; } break;
            case 5: if (x5 == 0) { x5 = 1; acarreo = 0; } else { x5 = 0; } break;
            case 4: if (x4 == 0) { x4 = 1; acarreo = 0; } else { x4 = 0; } break;
            case 3: if (x3 == 0) { x3 = 1; acarreo = 0; } else { x3 = 0; } break;
            case 2: if (x2 == 0) { x2 = 1; acarreo = 0; } else { x2 = 0; } break;
            case 1: if (x1 == 0) { x1 = 1; acarreo = 0; } else { x1 = 0; } break;
          }
        }
      }
      //Caso y negativo
      if (negativoY) {
        if (y1 == 0) {y1 = 1;} else {y1 = 0;}
        if (y2 == 0) {y2 = 1;} else {y2 = 0;}
        if (y3 == 0) {y3 = 1;} else {y3 = 0;}
        if (y4 == 0) {y4 = 1;} else {y4 = 0;}
        if (y5 == 0) {y5 = 1;} else {y5 = 0;}
        if (y6 == 0) {y6 = 1;} else {y6 = 0;}
        if (y7 == 0) {y7 = 1;} else {y7 = 0;}
        if (y8 == 0) {y8 = 1;} else {y8 = 0;}

        int acarreo = 1;
        for (int i = 8; i >= 1 && acarreo == 1; i--) {
          switch (i) {
            case 8: if (y8 == 0) { y8 = 1; acarreo = 0; } else { y8 = 0; } break;
            case 7: if (y7 == 0) { y7 = 1; acarreo = 0; } else { y7 = 0; } break;
            case 6: if (y6 == 0) { y6 = 1; acarreo = 0; } else { y6 = 0; } break;
            case 5: if (y5 == 0) { y5 = 1; acarreo = 0; } else { y5 = 0; } break;
            case 4: if (y4 == 0) { y4 = 1; acarreo = 0; } else { y4 = 0; } break;
            case 3: if (y3 == 0) { y3 = 1; acarreo = 0; } else { y3 = 0; } break;
            case 2: if (y2 == 0) { y2 = 1; acarreo = 0; } else { y2 = 0; } break;
            case 1: if (y1 == 0) { y1 = 1; acarreo = 0; } else { y1 = 0; } break;
          }
        }
      }

      //Resta Binaria de los numeros
      int acarreo = 0;
      int resta;

      for (int i = 8; i >= 1; i--){
        switch (i) {
          case 8:
            resta = x8 + (-y8) - acarreo;
            if (resta < 0) {
              z8 = resta + 2;
              acarreo = 1;
            } else {
              z8 = resta;
              acarreo = 0;
            }
            break;
          case 7:
            resta = x7 + (-y7) - acarreo;
            if (resta < 0) {
              z7 = resta + 2;
              acarreo = 1;
            } else {
              z7 = resta;
              acarreo = 0;
            }
            break;
          case 6:
            resta = x6 + (-y6) - acarreo;
            if (resta < 0) {
              z6 = resta + 2;
              acarreo = 1;
            } else {
              z6 = resta;
              acarreo = 0;
            }
            break;
          case 5:
            resta = x5 + (-y5) - acarreo;
            if (resta < 0) {
              z5 = resta + 2;
              acarreo = 1;
            } else {
              z5 = resta;
              acarreo = 0;
            }
            break;
          case 4:
            resta = x4 + (-y4) - acarreo;
            if (resta < 0) {
              z4 = resta + 2;
              acarreo = 1;
            } else {
              z4 = resta;
              acarreo = 0;
            }
            break;
          case 3:
            resta = x3 + (-y3) - acarreo;
            if (resta < 0) {
              z3 = resta + 2;
              acarreo = 1;
            } else {
              z3 = resta;
              acarreo = 0;
            }
            break;
          case 2:
            resta = x2 + (-y2) - acarreo;
            if (resta < 0) {
              z2 = resta + 2;
              acarreo = 1;
            } else {
              z2 = resta;
              acarreo = 0;
            }
            break;
          case 1:
            resta = x1 + (-y1) + acarreo;
            if (resta < 0) {
              z1 = resta + 2;
              acarreo = 1;
            } else {
              z1 = resta;
              acarreo = 0;
            }
            break;

        }
      }
      System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
      System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
      System.out.println("Resultado:");
      System.out.println("" + z1+z2+z3+z4+z5+z6+z7+z8);
    }
    //Multiplicacion
        if(resp == 3){
          boolean negativoX = false;
          boolean negativoY = false;
          System.out.println("Digita el primer numero");
          int x = scan.nextInt();
          if(x <= -1){ negativoX = true; x = x*-1;}
          System.out.println("Digita el segundo numero");
          int y = scan.nextInt();
          if(y <= -1){ negativoY = true; y = y*-1;}
          //Declaracion 8 bits para primer numero
          int x1,x2,x3,x4,x5,x6,x7,x8;
          //Declaracion 8 bits para segundo numero
          int y1,y2,y3,y4,y5,y6,y7,y8;
          int z1,z2,z3,z4,z5,z6,z7,z8;
          //Inicializacion en 0
          x1=x2=x3=x4=x5=x6=x7=x8=0;
          y1=y2=y3=y4=y5=y6=y7=y8=0;
          z1=z2=z3=z4=z5=z6=z7=z8=0;

            for(int i = 8;i >= 1;i--){
              int resX = x%2;
              x = x/2;

              int resY = y%2;
              y = y/2;

              switch (i) {
                case 1: x1 = resX; y1 = resY; break;
                case 2: x2 = resX; y2 = resY; break;
                case 3: x3 = resX; y3 = resY; break;
                case 4: x4 = resX; y4 = resY; break;
                case 5: x5 = resX; y5 = resY; break;
                case 6: x6 = resX; y6 = resY; break;
                case 7: x7 = resX; y7 = resY; break;
                case 8: x8 = resX; y8 = resY; break;
              }
            }

            // Caso x negativo
            if (negativoX) {
              if (x1 == 0) {x1 = 1;} else {x1 = 0;}
              if (x2 == 0) {x2 = 1;} else {x2 = 0;}
              if (x3 == 0) {x3 = 1;} else {x3 = 0;}
              if (x4 == 0) {x4 = 1;} else {x4 = 0;}
              if (x5 == 0) {x5 = 1;} else {x5 = 0;}
              if (x6 == 0) {x6 = 1;} else {x6 = 0;}
              if (x7 == 0) {x7 = 1;} else {x7 = 0;}
              if (x8 == 0) {x8 = 1;} else {x8 = 0;}

              int acarreo = 1;
              // Desde que i es = 8, mientras i sea mayor igual a 1
              // Y acarreo sea = 1 , ejecuta y luego resta 1 a i
              for (int i = 8; i >= 1 && acarreo == 1; i--) {
                switch (i) {
                  case 8: if (x8 == 0) { x8 = 1; acarreo = 0; } else { x8 = 0; } break;
                  case 7: if (x7 == 0) { x7 = 1; acarreo = 0; } else { x7 = 0; } break;
                  case 6: if (x6 == 0) { x6 = 1; acarreo = 0; } else { x6 = 0; } break;
                  case 5: if (x5 == 0) { x5 = 1; acarreo = 0; } else { x5 = 0; } break;
                  case 4: if (x4 == 0) { x4 = 1; acarreo = 0; } else { x4 = 0; } break;
                  case 3: if (x3 == 0) { x3 = 1; acarreo = 0; } else { x3 = 0; } break;
                  case 2: if (x2 == 0) { x2 = 1; acarreo = 0; } else { x2 = 0; } break;
                  case 1: if (x1 == 0) { x1 = 1; acarreo = 0; } else { x1 = 0; } break;
                  }
                }
              }
            // Caso y negativo
            if (negativoY) {
              if (y1 == 0) {y1 = 1;} else {y1 = 0;}
              if (y2 == 0) {y2 = 1;} else {y2 = 0;}
              if (y3 == 0) {y3 = 1;} else {y3 = 0;}
              if (y4 == 0) {y4 = 1;} else {y4 = 0;}
              if (y5 == 0) {y5 = 1;} else {y5 = 0;}
              if (y6 == 0) {y6 = 1;} else {y6 = 0;}
              if (y7 == 0) {y7 = 1;} else {y7 = 0;}
              if (y8 == 0) {y8 = 1;} else {y8 = 0;}

              int acarreo = 1;

              for (int i = 8; i >= 1 && acarreo == 1; i--) {
                switch (i) {
                  case 8: if (y8 == 0) { y8 = 1; acarreo = 0; } else { y8 = 0; } break;
                  case 7: if (y7 == 0) { y7 = 1; acarreo = 0; } else { y7 = 0; } break;
                  case 6: if (y6 == 0) { y6 = 1; acarreo = 0; } else { y6 = 0; } break;
                  case 5: if (y5 == 0) { y5 = 1; acarreo = 0; } else { y5 = 0; } break;
                  case 4: if (y4 == 0) { y4 = 1; acarreo = 0; } else { y4 = 0; } break;
                  case 3: if (y3 == 0) { y3 = 1; acarreo = 0; } else { y3 = 0; } break;
                  case 2: if (y2 == 0) { y2 = 1; acarreo = 0; } else { y2 = 0; } break;
                  case 1: if (y1 == 0) { y1 = 1; acarreo = 0; } else { y1 = 0; } break;
                  }
               }
            }

            //Multiplicacion Binaria
            int Multiplicacion = 0;

                if (y8 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 1;
        

                if (y7 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 2;
             

                if (y6 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 4;

                if (y5 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 8;
             

                if (y4 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 16;
                

                if (y3 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 32;
               

                if (y2 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 64;
                

                if (y1 == 1) Multiplicacion += (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1) * 128;
                
            
            z1 = Multiplicacion % 2;  Multiplicacion /= 2;
            z2 = Multiplicacion % 2;  Multiplicacion /= 2;
            z3 = Multiplicacion % 2;  Multiplicacion /= 2;
            z4 = Multiplicacion % 2;  Multiplicacion /= 2;
            z5 = Multiplicacion % 2;  Multiplicacion /= 2;
            z6 = Multiplicacion % 2;  Multiplicacion /= 2;
            z7 = Multiplicacion % 2;  Multiplicacion /= 2;
            z8 = Multiplicacion % 2;
        
        System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
        System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
        System.out.println("Resultado:");
        System.out.println("" +z8+z7+z6+z5+z4+z3+z2+z1);

          }

          //Division
        if(resp == 4){
          boolean negativoX = false;
          boolean negativoY = false;
          System.out.println("Digita el primer numero");
          int x = scan.nextInt();
          if(x <= -1){ negativoX = true; x = x*-1;}
          System.out.println("Digita el segundo numero");
          int y = scan.nextInt();
          if(y <= -1){ negativoY = true; y = y*-1;}
          //Declaracion 8 bits para primer numero
          int x1,x2,x3,x4,x5,x6,x7,x8;
          //Declaracion 8 bits para segundo numero
          int y1,y2,y3,y4,y5,y6,y7,y8;
          int z1,z2,z3,z4,z5,z6,z7,z8;
          int w1,w2,w3,w4,w5,w6,w7,w8;
          //Inicializacion en 0
          x1=x2=x3=x4=x5=x6=x7=x8=0;
          y1=y2=y3=y4=y5=y6=y7=y8=0;
          z1=z2=z3=z4=z5=z6=z7=z8=0;
          w1=w2=w3=w4=w5=w6=w7=w8=0;

            for(int i = 8;i >= 1;i--){
              int resX = x%2;
              x = x/2;

              int resY = y%2;
              y = y/2;

              switch (i) {
                case 1: x1 = resX; y1 = resY; break;
                case 2: x2 = resX; y2 = resY; break;
                case 3: x3 = resX; y3 = resY; break;
                case 4: x4 = resX; y4 = resY; break;
                case 5: x5 = resX; y5 = resY; break;
                case 6: x6 = resX; y6 = resY; break;
                case 7: x7 = resX; y7 = resY; break;
                case 8: x8 = resX; y8 = resY; break;
              }
            }

            // Caso x negativo
            if (negativoX) {
              if (x1 == 0) {x1 = 1;} else {x1 = 0;}
              if (x2 == 0) {x2 = 1;} else {x2 = 0;}
              if (x3 == 0) {x3 = 1;} else {x3 = 0;}
              if (x4 == 0) {x4 = 1;} else {x4 = 0;}
              if (x5 == 0) {x5 = 1;} else {x5 = 0;}
              if (x6 == 0) {x6 = 1;} else {x6 = 0;}
              if (x7 == 0) {x7 = 1;} else {x7 = 0;}
              if (x8 == 0) {x8 = 1;} else {x8 = 0;}

              int acarreo = 1;
              // Desde que i es = 8, mientras i sea mayor igual a 1
              // Y acarreo sea = 1 , ejecuta y luego resta 1 a i
              for (int i = 8; i >= 1 && acarreo == 1; i--) {
                switch (i) {
                  case 8: if (x8 == 0) { x8 = 1; acarreo = 0; } else { x8 = 0; } break;
                  case 7: if (x7 == 0) { x7 = 1; acarreo = 0; } else { x7 = 0; } break;
                  case 6: if (x6 == 0) { x6 = 1; acarreo = 0; } else { x6 = 0; } break;
                  case 5: if (x5 == 0) { x5 = 1; acarreo = 0; } else { x5 = 0; } break;
                  case 4: if (x4 == 0) { x4 = 1; acarreo = 0; } else { x4 = 0; } break;
                  case 3: if (x3 == 0) { x3 = 1; acarreo = 0; } else { x3 = 0; } break;
                  case 2: if (x2 == 0) { x2 = 1; acarreo = 0; } else { x2 = 0; } break;
                  case 1: if (x1 == 0) { x1 = 1; acarreo = 0; } else { x1 = 0; } break;
                  }
                }
              }
            // Caso y negativo
            if (negativoY) {
              if (y1 == 0) {y1 = 1;} else {y1 = 0;}
              if (y2 == 0) {y2 = 1;} else {y2 = 0;}
              if (y3 == 0) {y3 = 1;} else {y3 = 0;}
              if (y4 == 0) {y4 = 1;} else {y4 = 0;}
              if (y5 == 0) {y5 = 1;} else {y5 = 0;}
              if (y6 == 0) {y6 = 1;} else {y6 = 0;}
              if (y7 == 0) {y7 = 1;} else {y7 = 0;}
              if (y8 == 0) {y8 = 1;} else {y8 = 0;}

              int acarreo = 1;

              for (int i = 8; i >= 1 && acarreo == 1; i--) {
                switch (i) {
                  case 8: if (y8 == 0) { y8 = 1; acarreo = 0; } else { y8 = 0; } break;
                  case 7: if (y7 == 0) { y7 = 1; acarreo = 0; } else { y7 = 0; } break;
                  case 6: if (y6 == 0) { y6 = 1; acarreo = 0; } else { y6 = 0; } break;
                  case 5: if (y5 == 0) { y5 = 1; acarreo = 0; } else { y5 = 0; } break;
                  case 4: if (y4 == 0) { y4 = 1; acarreo = 0; } else { y4 = 0; } break;
                  case 3: if (y3 == 0) { y3 = 1; acarreo = 0; } else { y3 = 0; } break;
                  case 2: if (y2 == 0) { y2 = 1; acarreo = 0; } else { y2 = 0; } break;
                  case 1: if (y1 == 0) { y1 = 1; acarreo = 0; } else { y1 = 0; } break;
                  }
               }
            }

            //Division Binaria
            int Division = 0;
            int Residuo = 0;

            int X_num = (x1*128 + x2*64 + x3*32 + x4*16 + x5*8 + x6*4 + x7*2 + x8*1);  
            int Y_num = (y1*128 + y2*64 + y3*32 + y4*16 + y5*8 + y6*4 + y7*2 + y8*1);

            //Evitar indeterminacion al intentar dividir entre 0
            if (Y_num != 0) {
              Division = X_num / Y_num; 
              Residuo = X_num % Y_num;   
            } else {
              System.out.println("Indeterminacion: No se puede dividir entre 0");
            }
            //Cociente
            z1 = Division % 2;  Division /= 2;
            z2 = Division % 2;  Division /= 2;
            z3 = Division % 2;  Division /= 2;
            z4 = Division % 2;  Division /= 2;
            z5 = Division % 2;  Division /= 2;
            z6 = Division % 2;  Division /= 2;
            z7 = Division % 2;  Division /= 2;
            z8 = Division % 2;

            //Residuo 
            w1 = Residuo % 2;  Residuo /= 2;
            w2 = Residuo % 2;  Residuo /= 2;
            w3 = Residuo % 2;  Residuo /= 2;
            w4 = Residuo % 2;  Residuo /= 2;
            w5 = Residuo % 2;  Residuo /= 2;
            w6 = Residuo % 2;  Residuo /= 2;
            w7 = Residuo % 2;  Residuo /= 2;
            w8 = Residuo % 2;

        System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
        System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
        System.out.println("Resultado:");
        System.out.println("" +z8+z7+z6+z5+z4+z3+z2+z1);
        System.out.println("Residuo:");
        System.out.println("" +w8+w7+w6+w5+w4+w3+w2+w1);

          }

  }
}
