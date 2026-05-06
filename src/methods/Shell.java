package methods;

public class Shell {
    int comparaciones =0;
    int interacciones =0;
    int cambiosT =0;

    public void shellAsc(int[] array, Impresion imprimir) {
        int interac = 1;

        for (int gap = array.length/2; gap > 0; gap /= 2) {

            boolean cambio = true;

            while (cambio) {  
                cambio = false;

                for (int i = gap; i < array.length; i++) {
                    int a = array [i-gap];
                    int b = array [i];
                    boolean huboCambio = false;
                    comparaciones++;
                    System.out.println("I" + interac + "  " + imprimir.arregloLinea(array));

                    if (array[i - gap] > array[i]) {
                        int aux = array[i];
                        array[i] = array[i - gap];
                        array[i - gap] = aux;
                        cambio = true;
                        huboCambio = true; 
                        cambiosT++;
                        imprimir.impComparacion(gap, i, a, b, huboCambio);

                        System.out.print("\n  ");
                        for (int k = 0; k < array.length; k++){
                            if (k == i - gap) System.out.print(imprimir.format(array[i-gap]));
                            else if (k == i) System.out.print(imprimir.format(array[i]));
                            else System.out.print("     ");
                        }
                    } else {
                        imprimir.impComparacion(gap, i, a, b, huboCambio);
                    }
                    System.out.println();
                    
                }
                interac++;
                interacciones++;
            }
            
        }
        System.out.println("\n" + imprimir.indentacion("COMPARACIONES =" + comparaciones, 60));
        System.out.println(imprimir.indentacion("INTERACCIONES = " + interacciones, 60));
        System.out.println(imprimir.indentacion("CAMBIOS = " + cambiosT, 60));
    }

    public void shellDesc(int[] array, Impresion imprimir) {
        int interac = 1;

        for (int gap = array.length/2; gap > 0; gap /= 2) {

            boolean cambio = true;

            while (cambio) {  
                cambio = false;

                for (int i = gap; i < array.length; i++) {
                    int a = array [i-gap];
                    int b = array [i];
                    boolean huboCambio = false;
                    comparaciones++;
                    System.out.println("I" + interac + "  " + imprimir.arregloLinea(array));

                    if (array[i - gap] < array[i]) {
                        int aux = array[i];
                        array[i] = array[i - gap];
                        array[i - gap] = aux;
                        cambio = true;
                        huboCambio = true; 
                        cambiosT++;
                        imprimir.impComparacion(gap, i, a, b, huboCambio);

                        System.out.print("\n  ");
                        for (int k = 0; k < array.length; k++){
                            if (k == i - gap) System.out.print(imprimir.format(array[i-gap]));
                            else if (k == i) System.out.print(imprimir.format(array[i]));
                            else System.out.print("     ");
                        }
                    } else {
                        imprimir.impComparacion(gap, i, a, b, huboCambio);
                    }
                    System.out.println();
                }
                interac++;
                interacciones++;
            }
            
        }
        System.out.println("\n" + imprimir.indentacion("COMPARACIONES =" + comparaciones, 60));
        System.out.println(imprimir.indentacion("INTERACCIONES = " + interacciones, 60));
        System.out.println(imprimir.indentacion("CAMBIOS = " + cambiosT, 60));
    }


    public void sort (int[] array, boolean asc, Impresion imprimir){
        if (asc){
            System.out.println("Orden ascendente: ");
            shellAsc(array, imprimir);
        } else{
            System.out.println("Orden descendente: ");
            shellDesc(array, imprimir);
        }

    }

}


