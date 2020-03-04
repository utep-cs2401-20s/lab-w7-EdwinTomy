//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class SortOfSortTester {

    //Testing for smallest possible non-empty array: PASSED
    @Test
    public void TestSort1(){
        System.out.println("Test Case #1");
        int[] arr = new int[] {1};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

        int[] arrExpected = new int[] {1};
        int[] arrResult = SortOfSort.sortOfSort(arr);

        assertArrayEquals(arrExpected,arrResult);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    //Testing for when array.length < 4, since the pattern is made of 4 numbers: PASSED
    @Test
    public void TestSort2(){
        System.out.println("Test Case #2");
        int[] arr = new int[] {2, 5, 4};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

        int[] arrExpected = new int[] {2, 4, 5};
        int[] arrResult = SortOfSort.sortOfSort(arr);

        assertArrayEquals(arrExpected,arrResult);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    //Testing for when array.length is odd, since the pattern wouldn't end perfectly: PASSED
    @Test
    public void TestSort3(){
        System.out.println("Test Case #3");
        int[] arr = new int[] {1, 2, 3, 5, 0};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

        int[] arrExpected = new int[] {2, 1, 0, 3, 5};
        int[] arrResult = SortOfSort.sortOfSort(arr);

        assertArrayEquals(arrExpected,arrResult);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    //Testing for negative numbers: PASSED
    @Test
    public void TestSort4(){
        System.out.println("Test Case #4");
        int[] arr = new int[] {1, 4, 5, 3, 0, -2, -4};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

        int[] arrExpected = new int[] {3, 1, -4, -2, 0, 4, 5};
        int[] arrResult = SortOfSort.sortOfSort(arr);

        assertArrayEquals(arrExpected,arrResult);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    //Testing when there are duplicate values: PASSED
    @Test
    public void TestSort5(){
        System.out.println("Test Case #5");
        int[] arr = new int[] {2, 3, 4, 5, 5, 1, 1};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");

        int[] arrExpected = new int[] {4, 3, 1, 1, 2, 5, 5};
        int[] arrResult = SortOfSort.sortOfSort(arr);

        assertArrayEquals(arrExpected,arrResult);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

}