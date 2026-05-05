package methods;

public class Insertion {
    public static void sort(int[] array,boolean asc){
        
        for(int i = 1; i < array.length; i++){
           
            int aux = array[i];
            int j = i - 1;

            while (j >= 0)            {
                if (asc) {
                    if (array[j] > aux) {
                        array[j + 1] = array[j]; j--;
                    } else {
                        break;
                    }
                } else {
                    if (array[j] < aux) {
                        array[j + 1] = array[j]; j--;
                    } else {
                        break;
                    }
                }
            }
            array[j+1] = aux;
            mostrar(array);
        }
    }
    public static void mostrar(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}