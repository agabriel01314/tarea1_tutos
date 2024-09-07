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
