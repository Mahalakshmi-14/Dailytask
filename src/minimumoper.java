import java.util.HashMap;
import java.util.Set;
public class minimumoper {
    public static int getMinimumOperations(int arr[], int n) {
        HashMap<Integer, Integer> countFreq = new HashMap<Integer, Integer>();
        for (int i=0; i<n; i++) {
            if(countFreq.containsKey(arr[i])) {
                countFreq.put(arr[i], countFreq.get(arr[i])+1);
            }
            else {
                countFreq.put(arr[i], 1);
            }
        }
        int maxCount = 0;
        Set<Integer> s = countFreq.keySet();
        for (int i : s)
            if (maxCount < countFreq.get(i))
                maxCount = countFreq.get(i);
        return (n - maxCount);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        System.out.println(getMinimumOperations(arr, n));
    }
}


