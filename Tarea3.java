import java.util.HashMap;

public class Tarea3 {
    public static int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Calcular el complemento

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };  // Retornar los índices
            }
