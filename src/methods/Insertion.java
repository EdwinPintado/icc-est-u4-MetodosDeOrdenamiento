package methods;

public class Insertion {
    int comparaciones =0;
    int interacciones =0;
    int cambiosT =0;
    public void insertionAsc(int[] array, Impresion imprimir) {
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
                comparaciones++;
                if (array[j] > aux) {
                    array[j + 1] = array[j]; 
                    j--;
                    cambios = true;
                    cambiosT++;
                } else {
                    imprimir.impComparacionImp(1, a, b, cambios);
                    break;
                }
                imprimir.impComparacionImp(1, a, b, cambios);
            }
            array[j + 1] = aux;
            com++;
            interacciones++;
        }
        System.out.println("\n" + imprimir.indentacion("COMPARACIONES =" + comparaciones, 60));
        System.out.println(imprimir.indentacion("INTERACCIONES = " + interacciones, 60));
        System.out.println(imprimir.indentacion("CAMBIOS = " + cambiosT, 60));
    }


    public void insertionDesc(int[] array, Impresion imprimir){
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
                comparaciones++;
                if (array[j] <  aux) {
                    array[j + 1] = array[j]; 
                    j--;
                    cambios = true;
                    cambiosT++;
                } else {
                    imprimir.impComparacionImp(1, a, b, cambios);
                    break;
                }
                imprimir.impComparacionImp(1, a, b, cambios);
            }
            array[j + 1] = aux;
            com++;
            interacciones++;
        }
        System.out.println("\n" + imprimir.indentacion("COMPARACIONES =" + comparaciones, 60));
        System.out.println(imprimir.indentacion("INTERACCIONES = " + interacciones, 60));
        System.out.println(imprimir.indentacion("CAMBIOS = " + cambiosT, 60));
    }

    public void sort (int[] array, boolean asc,Impresion imprimir){ 
        if (asc){
            System.out.println("Orden ascendente: ");
            insertionAsc(array, imprimir);
        } else{
            System.out.println("Orden descendente: ");
            insertionDesc(array, imprimir);
        }

    }
}