public class SortOfSort {

    //Starter method sortOfSort() for recursion
    public static int[] sortOfSort(int[] arr) {
        return sortHelper(arr, 0, arr.length - 1, 0);
    }

    //Helper recursive method sortHelper() for sortOfSort()
    //startIndex and endIndex are the ends of the unsorted part of the array
    //counter keeps track which largest number are we on
    public static int[] sortHelper(int[] arr, int startIndex, int endIndex, int counter) {

        //When endIndex and startIndex pass each other, all elements are sorted, returns array
        if(endIndex - startIndex < 0)
            return arr;

        //Finding index of largest element in the unsorted array
        int maxIndex = maxIndex(arr, startIndex, endIndex);

        //When counter is 0 or 1 mod 4, the largest number is swapped to the right
        //When counter is 2 or 3 mod 4, the largest number is swapped to the left
        //Recursive call on new, shorter unsorted array
        if (counter % 4 < 2) {
            swap(arr, endIndex, maxIndex);
            return sortHelper(arr, startIndex, endIndex - 1, counter + 1);
        } else {
            swap(arr, startIndex, maxIndex);
            return sortHelper(arr, startIndex + 1, endIndex, counter + 1);
        }
    }

    //Method maxIndex() to find index of largest element on unsorted array
    public static int maxIndex(int[] arr, int startIndex, int endIndex){
        int maxVal = startIndex;
        for(int i = startIndex; i <= endIndex; i++){
            if(arr[maxVal] < arr[i])
                maxVal = i;
        }return maxVal;
    }

    //Method swap() swaps two elements of the array
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
}
