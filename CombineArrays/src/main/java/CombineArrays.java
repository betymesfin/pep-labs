
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int aLen = arr1.length;
        int bLen = arr2.length;
        int[] result = new int[aLen + bLen];
        int i = 0;
        for (int element : arr1) {
            result[i] = element;
            i++;
        }

        for (int element : arr2) {
            result[i] = element;
            i++;
        }

        return result;
    }
}
