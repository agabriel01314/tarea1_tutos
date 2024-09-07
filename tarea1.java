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
            int sum = temp + reverseNumber(temp);
            if (isPalindrome(sum)) {
                System.out.println(temp + " + " + reverseNumber(temp) + " = " + sum);
                temp = sum;
            } else {
                temp = sum;
            }
        }
        return true;
    }

