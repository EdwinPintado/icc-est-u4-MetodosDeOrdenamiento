package methods;

public class Impresion {


    public void imprimirNum(int numero){

        if (numero >= 0){
            if (numero < 10){
                System.out.print("    " + numero);

            }else if (numero < 100){
                System.out.print("   " + numero);

            }else {
                System.out.print("  ");
            }
        }else{
            if (numero > -10){
                System.out.print("   " + numero);

            }else if (numero > -100){
                System.out.print("  " + numero);

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

    public String format (int numero){
        String n = String.valueOf(numero);

        if (numero >= 0){
            if (numero < 10) return "   " + n;
            if (numero < 100) return "  " + n;
            else return "  " + n;
        }else{ 
            if (numero > -10) return "  " + n;
            if (numero > -100) return "   " + n; 
            else return " "+n;
        }
    }

    public void impComparacionImp(int i,  int a, int b, boolean huboCambio){

        String linea = "  a=" +(i) + "  b=" + i + "  [a]=" + format(a) + "  [b]=" + format(b) + "  cambio=" + (huboCambio ? "si":"no");
        System.out.println(linea);
    }

    public void impComparacion(int gap,int i,  int a, int b, boolean huboCambio){

        String linea = "     gap=" + gap + "  a=" +(i-gap) + "  b=" + i + "  [a]=" + format(a) + "  [b]=" + format(b) + "  cambio=" + (huboCambio ? "si":"no");
        System.out.println(linea);
    }


    public static String indentacion(String escritura, int ancho){
        String salida = "";
        int espaciado = ancho - escritura.length();
        for(int i = 0; i < espaciado; i++){
            salida += " ";
        }
        return salida + escritura;
    }

    public String arregloLinea(int[] array){
        String st = "";
        for (int n : array){
            st += format(n);
        }
        return st;
        
    }
            
}
        

