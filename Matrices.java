import java.util.Random;
import java.util.Scanner;

public class Matrices {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vector(sc);
        paresImpares();;
        primes();

        }
    public static void vector(Scanner sc){
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i ++){
            System.out.println("INGRESE EL NUMERO PARA LA POSICION "+ i +": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println("["+i+"]: " + numbers[i]);
        }
    }
    public static void paresImpares(){
        int[] numbers = new int[20];
        Random random = new Random();
        
        for (int i= 0; i< numbers.length; i++){
          numbers[i] = random.nextInt(100) + 1;
        } 
        System.out.println("NUMEROS PARES: ");
        for (int j = 0; j < numbers.length; j++){
          if(numbers[j] % 2 == 0){
              System.out.print(numbers[j]+ " ");
          }
        }
        System.out.print("\nNUMEROS IMPARES: ");
        int k = 0;
        while (k < numbers.length){
          if(numbers[k] % 2 != 0){
              System.out.print(numbers[k]+", ");
          }
          k++;
        }
    }
    public static void primes(){
    int count = 0;
    int number = 2;  
    int[] primes = new int[1000];
        while (count < primes.length) {
            if (isPrime(number)){
                primes[count] = number;
                count++;
            }
            number++;
        }
        for(int i = 0; i  < primes.length; i++){
        System.out.print(primes[i] + " ");
        }
    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void derechaIzquierda(){
          int[][] matriz = { {1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15},
                       {16,17,18,19,20} 
    };
    for (int i = 0; i < matriz.length; i++){
        System.out.print("|");
        for (int j = 0; j < matriz[i].length; j++){
            System.out.print(String.format("%02d ", matriz[i][j]));
        }
        System.out.print("|");
        System.out.println();
    }
    System.out.println("----------------------------------");

boolean izquierdaDerecha = true; // variable para determinar la dirección de impresión

for (int i = 0; i < matriz.length; i++) {
    if (izquierdaDerecha) { // imprimir de izquierda a derecha
        System.out.print("|");
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(String.format("%02d ", matriz[i][j]));
        }
        izquierdaDerecha = false;
    } else { // imprimir de derecha a izquierda
        System.out.print("|");
        for (int j = matriz[i].length - 1; j >= 0; j--) {
            System.out.print(String.format("%02d ", matriz[i][j]));
        }
        izquierdaDerecha = true;
    }
    System.out.println("|"); // imprimir separador de fila
}}
public static void tablasMultiplicar(Scanner sc){
                int[][] matriz = new int[10][10];
                // Llenar la matriz con los resultados de las tablas de multiplicar
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        matriz[i][j] = (i+1) * (j+1);
                    }
                }
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print((i+1) + "*" + (j+1) + " ");
                    }
                    System.out.println();
                }
                
                // Pedir al usuario la tabla de multiplicar y el multiplicador
                System.out.print("INGRESE LA TABLA DE MULTIPLICAR (1-10): ");
                int tabla = sc.nextInt();
                System.out.print("INGRESE EL MULTIPLICADOR (1-10): ");
                int multiplicador = sc.nextInt();
                
                // Obtener el resultado de la multiplicación y mostrarlo
                int resultado = matriz[tabla-1][multiplicador-1];
                System.out.println("EL RESULTADO DE LA MULTIPLICACIÓN ES: " + resultado);
            }
}

    

