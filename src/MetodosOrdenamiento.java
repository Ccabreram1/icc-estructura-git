public class MetodosOrdenamiento {
    //1. Metodo que devuelve un arreglo de enteros ordenados por Burbuja 
    public int[] sortByBubble(int[]arreglo,boolean longs){
        ///Code to sort 
        /// Obtener el tamaño del arreglo
        int tamano = arreglo.length;

        ///Bucle externo que va a recorrer todo el arreglo
        
        for (int i = 0;i<tamano;i++){
            if(longs){
                System.out.println("\nPasado numero " +i);
            }
           

            //Blucle for interno que compara el elemento actual con los siguientes
            for (int j = i+1;j<tamano;j++){
                if (longs) {
                    System.out.println("i="+arreglo[i]+"j="+arreglo[j]);
                }
                if(arreglo[i]>arreglo[j]){
                    //Intercambiamos los elementos
                    if (longs) {
                        System.out.println("-Si es mayor asi de cambio ");
                    }
                    int temporal = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;

                    if (longs) {

                        System.out.print(" ");
                        imprime(arreglo);
                    }
                }
            }
        }
        return arreglo;
    }

    //2. Metodo que devuelve un arreglo de enteros ordenados por Seleccion
    
    
    //3. Metodo que devuelve un arreglo de enteros ordenados por Insercion

    //4. Metodo que devuelve un arreglo de enteros ordenados por 
    public void imprime(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+ " ");
        }
        System.out.println();
    }



    
}
