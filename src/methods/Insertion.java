package methods;

public class Insertion {
    public void insertionAsc(int[] array){
        int com = 1;
        
        for(int i = 1; i < array.length; i++){

            System.out.println("C " + com + "  ");    
                    imprimirInsertion(array);
            
            int aux = array[i];
            int j = i - 1;
            
            
            while (j >= 0){
                boolean cambios = false;
                if (array[j] > aux) {
                    array[j + 1] = array[j]; 
                    j--;
                    cambios = true;
                } else {
                    imprimirInsertion(array);
                    break;
                }
                imprimirInsertion(array);
            }
            array[j + 1] = aux;
            com++;
            }
        }

    public void insertionDesc(int[] array){
        int com = 1;
        for(int i = 1; i < array.length; i++){

            System.out.println("C " + com + "  ");    
                 imprimirInsertion(array);
            
            int aux = array[i];
            int j = i - 1;
           
            while (j >= 0){
                boolean cambios = false;

                if (array[j] < aux) {
                    array[j + 1] = array[j]; 
                    j--;
                    cambios = true;
                } else {
                    imprimirInsertion(array);
                    break;
                }
                imprimirInsertion(array);
            }
            array[j + 1] = aux;
            com++;
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