package methods;

public class Shell {

    public void shellAsc(int[] array, Impresion imprimir) {
        int interac = 1;

        for (int gap = array.length/2; gap > 0; gap /= 2) {

            boolean cambio = true;
            while (cambio) {  
                cambio = false;
                System.out.println("I" + interac + "  ");
                imprimir.imprimir(array);

                for (int i = gap; i < array.length; i++) {
                    int a = array [i-gap];
                    int b = array [i];
                    boolean cambios = false;

                    if (array[i - gap] > array[i]) {
                        int aux = array[i];
                        array[i] = array[i - gap];
                        array[i - gap] = aux;
                        cambio = true;
                        cambios = true; 
                    }
                    imprimir.impComparacion(gap, a, b, cambios);
                }
            }
            interac++;
        }
    }

    public void shellDesc(int[] array, Impresion imprimir) {
        int interac = 1;

        for (int gap = array.length/2; gap > 0; gap /= 2) {

            boolean cambio = true;
            while (cambio) {  
                cambio = false;
                System.out.println("I" + interac + "  ");
                imprimir.imprimir(array);

                for (int i = gap; i < array.length; i++) {
                    int a = array [i-gap];
                    int b = array [i];
                    boolean cambios = false;

                    if (array[i - gap] < array[i]) {
                        int aux = array[i];
                        array[i] = array[i - gap];
                        array[i - gap] = aux;
                        cambio = true;
                        cambios = true;
                    }
                    imprimir.impComparacion(gap, a, b, cambios);
                }
            }
            interac++;
        }
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


