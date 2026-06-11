package june_2_2026;

/* 
Steps:-
1. create a frequency array of size n+1 (n is the size of the input array) and initialize all elements to 0.
2. Iterate through the input array and for each element, increment the corresponding index in the frequency array.
3. The frequency array will now contain the count of each element in the input array, where the index represents 
the element and the value at that index represents its frequency.      
*/
public class frquencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        int n = arr.length;
        int[] frequencyArray = new int[n + 1];

        // Step 2: Count the frequency of each element
        for (int i = 0; i < n; i++) {
            frequencyArray[arr[i]]++;
        }

        // Step 3: Print the frequency array
        System.out.println("Element : Frequency");
        for (int i = 0; i <= n; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println(i + " : " + frequencyArray[i]);
            }
        }
    }
}
