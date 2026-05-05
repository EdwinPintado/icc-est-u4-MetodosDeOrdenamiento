package methods;

public class Insertion {
    public void insertionAsc(int[] array){
        
        for(int i = 1; i < array.length; i++){

            int aux = array[i];
            int j = i - 1;

            while (j >= 0){
                if (array[j] > aux) {
                    array[j + 1] = array[j]; 
                    j--;
                    
                } else {
                    break;
                }
            array[j + 1] = aux;
            }
        }
    }  

    public void insertionDesc(int[] array){
        
        for(int i = 1; i < array.length; i++){
            
            int aux = array[i];
            int j = i - 1;

            while (j >= 0){
                if (array[j] < aux) {
                    array[j + 1] = array[j]; 
                    j--;
                } else {
                    break;
                }
            array[j + 1] = aux;
            }
        }
    }

    public void imprimirInsertion(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void sort (int[] array, boolean asc){
        if (asc){
            System.out.println("Orden ascendente: ");
            insertionAsc(array);
        } else{
            System.out.println("Orden descendente: ");
            insertionDesc(array);
        }

    }
}