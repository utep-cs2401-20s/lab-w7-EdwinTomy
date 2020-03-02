//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class SortOfSortTester {

    @Test
    public void TestSort1(){
        System.out.println("Test Case #1");
        int[] arr = new int[] {1, 4, 5, 3, 0, -2, -4};
        int[] arrExpected = new int[] {3, 1, -4, -2, 0, 4, 5};
        int[] arrResult = SortOfSort.sortOfSort(arr);

        for(int i = 0; i < arrResult.length; i++){
            System.out
        }

        assertArrayEquals(arrExpected,arrResult);
    }
}