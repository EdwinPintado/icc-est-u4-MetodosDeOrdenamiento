import java.util.Arrays;
import java.util.Scanner;
import methods.Insertion;
import methods.Shell;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n==== PROGRAMA DE ORDENAMIENTO ====\n");
     
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("\nElija una opcion: ");

            opcion = entrada.nextInt();
            String validar;

            switch (opcion) {
                case 1:

                    do{
                        System.out.print("\n¿Inserción ascendente?  (true/false): ");
                        validar = entrada.next();
                        if (validar.equals("true")){
                            boolean insercionAscendente = true;
                            break;
                        } else if (validar.equals("false")) {
                            boolean insercionDescendente = false;
                            break;
                        }else {
                            System.out.println("\nError en dato o escritura, por favor intentelo de nuevo, recuerde (true/false) solo en minusculas");
                        }
                    } while (true);
                    
                    do{
                        System.out.print("\n¿Shell ascendente?  (true/false): ");
                        validar = entrada.next();
                        if (validar.equals("true")){
                            boolean shellAscendente = true;
                            break;
                        } else if (validar.equals("false")) {
                            boolean shellDescendente = false;
                            break;
                        }else {
                            System.out.println("\nError en dato o escritura, por favor intentelo de nuevo, recuerde (true/false) solo en minusculas");
                        }
                    } while (true);
                        


                case 2: 
                System.out.println("\nGracias por usar el programa, vuelva pronto");
                    break;

                default:
                    System.out.println("\nDato no valido, por favor intentelo de nuevo");
                    break;
            }

        } while (opcion != 2);
        entrada.close();
    }
}
