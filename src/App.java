public class App {
    public static void main(String[] args) throws Exception {
        ///Crear la instancia de la (calse u objeto) MetodosOrdenamiento
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();
        //Creo el arreglo de enteros
        int[] numeros ={30, 7, 12, 5};

        //Mandar a imprimir mi arreglo
        metodosOrdenamiento.imprime(numeros);


        //Llamo al metodo sortBybubble y su respuesta guardo en la variable arregloOrdenadoBuble
        int[] arregloOrdenadoBuble = metodosOrdenamiento.sortByBubnle(numeros,false);
        //Mando a imprimir mi nuevo arreglo que ya fue ordenado en arregloOrdenadoBuble 
        metodosOrdenamiento.imprime(arregloOrdenadoBuble);




        ///TODO: Hacer un menu que elija el metodo
    }
}
