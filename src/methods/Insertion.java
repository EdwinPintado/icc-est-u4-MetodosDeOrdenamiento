package methods;
import methods.*;
public class Insertion {
    public void insertionAsc(int[] array, Imprimir imprimir) {
        int com = 1;
        
        for(int i = 1; i < array.length; i++){

            System.out.println("C " + com + "  ");    
            imprimir.imprimir(array);
            
            int aux = array[i];
            int j = i - 1;
            
            
            while (j >= 0){
                int a = array[j];
                int b = aux;
                boolean cambios = false;

                if (array[j] > aux) {
                    array[j + 1] = array[j]; 
                    j--;
                    cambios = true;
                } else {
                    imprimir.impComparacion(1, a, b, cambios);
                    break;
                }
                imprimir.impComparacion(1, a, b, cambios);
            }
            array[j + 1] = aux;
            com++;
            }
        }

    public void insertionDesc(int[] array, Imprimir imprimir){
        int com = 1;
        for(int i = 1; i < array.length; i++){

            System.out.println("C " + com + "  ");    
                 imprimir.imprimir(array);
            
            int aux = array[i];
            int j = i - 1;
           
            while (j >= 0){
                int a = array[j];
                int b = aux;
                boolean cambios = false;

                if (array[j] < aux) {
                    array[j + 1] = array[j]; 
                    j--;
                    cambios = true;
                } else {
                    imprimir.impComparacion(1, a, b, cambios);
                    break;
                }
                imprimir.impComparacion(1, a, b, cambios);
            }
            array[j + 1] = aux;
            com++;
            }
        }

    public void sort (int[] array, boolean asc,Imprimir imprimir){ 
        if (asc){
            System.out.println("Orden ascendente: ");
            insertionAsc(array, imprimir);
        } else{
            System.out.println("Orden descendente: ");
            insertionDesc(array, imprimir);
        }

    }
}