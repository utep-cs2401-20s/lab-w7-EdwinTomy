public class SortOfSort {
    public static int[] sortOfSort(int[] arr) {
        return sortHelper(arr, 0, arr.length - 1, 0);
    }

    public static int[] sortHelper(int[] arr, int startIndex, int endIndex, int counter) {
        if(endIndex - startIndex < 0)
            return arr;

        int maxIndex = maxIndex(arr, startIndex, endIndex);
        if (counter % 4 < 2) {
            swap(arr, endIndex, maxIndex);
            return sortHelper(arr, startIndex, endIndex - 1, counter + 1);
        } else {
            swap(arr, startIndex, maxIndex);
            return sortHelper(arr, startIndex - 1, endIndex, counter + 1);
        }
    }

    public static int maxIndex(int[] arr, int startIndex, int endIndex){
        int maxVal = startIndex;
        for(int i = startIndex; i <= endIndex; i++){
            if(maxVal < arr[i])
                maxVal = i;
        }return maxVal;
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= arr[index1];
    }
}
