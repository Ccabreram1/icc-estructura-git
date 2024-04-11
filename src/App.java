import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        int opcion;
        int[] arregloNumeros=new int[0];
        do{
            System.out.println("\nMenu principal");
            System.out.println("1. Ingresar arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("0. salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño de su arreglo");
                    int tamano = scanner.nextInt();
                    arregloNumeros = new int[tamano];
                    for(int i=0;i<arregloNumeros.length;i++){
                        System.out.println("Ingrese el valor para "+(i+1)+": ");
                        arregloNumeros[i]=scanner.nextInt();
                        
                    }
                    metodos.imprime(arregloNumeros);
                    break;
                case 2:
                    //submenu para escoger el metodo
                    mostrarSubMenuMetodos(scanner,metodos,arregloNumeros);

                    break;
                case 0:
                    System.out.println("Saliendo del programa...\nComo dice el ginecologo partooooo!!!");
                    break;
                default:
                    System.out.println("Opcion no valida. Repita");
            
            }


        }while(opcion != 0);

        ///TODO: Hacer un menu que elija el metodo
    }
    public static void mostrarSubMenuMetodos(Scanner scanner, MetodosOrdenamiento metodos, int[] arreglo){
        int opcionMetodo;
        do {
            System.out.println("\nEscoja un metodo de ordenamiento");
            System.out.println("1. Metodo de Burbuja");
            System.out.println("2. Metodo de Seleccion");
            System.out.println("3. Metodo de Insercion");
            System.out.println("0. Regresar al menu principal");
            opcionMetodo = scanner.nextInt();

            switch (opcionMetodo) {
                case 1:
                    int[] arregloOrdenado = metodos.sortByBubble(arreglo,false);
                    metodos.imprime(arregloOrdenado);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escoja una opcion valida");
            }

        } while (opcionMetodo!=0);
    }
}
