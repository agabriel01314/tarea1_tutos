public class Tarea2 {

    // Función para calcular el número triangular
    public static long triangular(long n) {
        return n * (n + 1) / 2;
    }

    // Función para calcular el número pentagonal
    public static long pentagonal(long n) {
        return n * (3 * n - 1) / 2;
    }

    // Función para calcular el número hexagonal
    public static long hexagonal(long n) {
        return n * (2 * n - 1);
    }

    // Función para encontrar el siguiente número común en las tres series
    public static void encontrarSiguienteNumero() {
        long nTri = 285;  // Comenzamos en el número triangular antes del 40755 ya que le preguntamos a la ia para saber donde iniciaba el valor
        long nPen = 165;  // Comenzamos en el número pentagonal antes del 40755 ya que le preguntamos a la ia para saber donde iniciaba el valor
        long nHex = 143;  // Comenzamos en el número hexagonal antes del 40755 ya que le preguntamos a la ia para saber donde iniciaba el valor

        long triangular, pentagonal, hexagonal;
        while (true) {
            triangular = triangular(nTri);
            pentagonal = pentagonal(nPen);
            hexagonal = hexagonal(nHex);

            if (triangular == pentagonal && pentagonal == hexagonal) {
                System.out.println("El siguiente número que es triangular, pentagonal y hexagonal es: " + triangular);
                break;
            }

            if (triangular <= pentagonal && triangular <= hexagonal) {
                nTri++;
            } else if (pentagonal <= triangular && pentagonal <= hexagonal) {
                nPen++;
            } else {
                nHex++;
            }
        }
    }

    public static void main(String[] args) {
        encontrarSiguienteNumero();
    }
}
