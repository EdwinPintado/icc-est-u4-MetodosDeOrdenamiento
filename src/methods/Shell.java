package methods;

public class Shell {

    public void shellAsc(int[] array) {

        for (int gap = array.length/2; gap > 0; gap /= 2) {

            boolean cambio = true;
            while (cambio) {  
                cambio = false;

                for (int i = gap; i < array.length; i++) {
                    if (array[i - gap] > array[i]) {
                        int aux = array[i];
                        array[i] = array[i - gap];
                        array[i - gap] = aux;
                        cambio = true;
                    }
                }
            }
        }
    }

    public void shellDesc(int[] array) {

        for (int gap = array.length/2; gap > 0; gap /= 2) {

            boolean cambio = true;
            while (cambio) {  
                cambio = false;

                for (int i = gap; i < array.length; i++) {
                    if (array[i - gap] < array[i]) {
                        int aux = array[i];
                        array[i] = array[i - gap];
                        array[i - gap] = aux;
                        cambio = true;
                    }
                }
            }
        }
    }

    public void imprimirShell(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void sort (int[] array, boolean asc){
        if (asc){
            System.out.println("Orden ascendente: ");
            shellAsc(array);
        } else{
            System.out.println("Orden descendente: ");
            shellDesc(array);
        }

    }

}


