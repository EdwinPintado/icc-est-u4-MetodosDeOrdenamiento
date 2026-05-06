package methods;

public class Impresion {


    public void imprimirNum(int numero){

        if (numero >= 0){
            if (numero < 100){
                System.out.print("   " + numero);

            }else if (numero < 10){
                System.out.print("    " + numero);

            }else {
                System.out.print("  ");
            }
        }else{
            if (numero > -100){
                System.out.print("  " + numero);

            }else if (numero > -10){
                System.out.print("   " + numero);

            }else {
                System.out.print(numero);
            }
        }
    }

    public void imprimir(int[] array) {
        for (int i : array) {
            imprimirNum(i);
        }
        System.out.println();
    }

    public void impComparacion(int gap, int a, int b, boolean huboCambio){
        
        System.out.print(" ");

        System.out.print("Gap=" + gap);

        if (gap < 10 ) System.out.print("  ");
        else System.out.print("  ");

        System.out.print(" a=");
        imprimirNum(a);

        System.out.print(" b=");
        imprimirNum(b);

        System.out.print("  huboCambio=" + (huboCambio ? "si":"no"));
        System.out.println();
    }
            
}
        

