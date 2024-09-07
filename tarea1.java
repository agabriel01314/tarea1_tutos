public class tarea1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            if (isMachete(i)) {
                count++;
            }
        }
        System.out.println("Hay " + count + " números Machete menores a 10,000.");
    }

    public static boolean isMachete(int number) {
        int temp = number;
        for (int i = 0; i < 50; i++) {
            int reversed = reverseNumber(temp);
            int sum = temp + reversed;
            if (isPalindrome(sum)) {
                System.out.println(temp + " + " + reversed + " = " + sum);
                return false;  // Si encontramos un palíndromo, no es un número Machete
            }
            temp = sum;
        }
        return true;  // Solo devolvemos true si no encontramos un palíndromo en 50 iteraciones
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
}
