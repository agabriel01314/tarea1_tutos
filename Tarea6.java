import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea6 {

    public static List<List<Integer>> generarTrianguloPascal(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El valor de n debe ser mayor o igual a 0");
        }

        List<List<Integer>> triangulo = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            List<Integer> fila = new ArrayList<>();

            fila.add(1);

            for (int j = 1; j < i; j++) {
                int valor = triangulo.get(i - 1).get(j - 1) + triangulo.get(i - 1).get(j);
                fila.add(valor);
            }

            if (i > 0) {
                fila.add(1);
            }

            triangulo.add(fila);
        }

        return triangulo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de n para el Triángulo de Pascal: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("El valor de n debe ser mayor o igual a 0.");
        } else {
            List<List<Integer>> resultado = generarTrianguloPascal(n);

            for (List<Integer> fila : resultado) {
                System.out.println(fila);
            }
        }
    }
}
