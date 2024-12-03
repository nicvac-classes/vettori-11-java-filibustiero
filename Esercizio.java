Ecco il codice in Java: 

```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Inserisci il numero di cifre (N): ");
        int N = scanner.nextInt();

        int[] U = new int[N];
        int[] R = new int[N];
        int[] S = new int[N];
        double[] M = new double[N];

        for (int i = 0; i < N; i++) {
            int num;
            do {
                System.out.print("Inserisci un numero intero positivo per U[" + i + "]: ");
                num = scanner.nextInt();
            } while (num < 0);
            U[i] = num;
        }

        for (int i = 0; i < N; i++) {
            R[i] = random.nextInt(11);
            S[i] = random.nextInt(6) + 3;
            M[i] = (U[i] + R[i] + S[i]) / 3.0;
        }

        System.out.println("Vettore M:");
        for (double val : M) {
            System.out.printf("%.2f ", val);
        }
        System.out.println();

        System.out.print("Inserisci un numero intero T: ");
        int T = scanner.nextInt();

        System.out.println("Coppie del vettore U con somma uguale a T:");
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (U[i] + U[j] == T) {
                    System.out.println("(" + U[i] + ", " + U[j] + ")");
                }
            }
        }

        scanner.close();
    }
}
```
