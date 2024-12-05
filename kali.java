
import java.util.HashMap;

public class kali {
    public static void main(String[] args) {
        int[] array = {3, 7, 3, 1, 7, 7, 5};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int mostFrequentElement = array[0];
        int maxCount = 0;

       
        for (int num : array) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

           
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = num;
            }
        }

        
        System.out.println("Elemen yang paling sering muncul adalah " + mostFrequentElement + " sebanyak " + maxCount + " kali");
    }
}

